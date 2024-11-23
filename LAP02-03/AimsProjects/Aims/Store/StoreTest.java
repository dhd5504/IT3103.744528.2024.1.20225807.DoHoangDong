package Store;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import Disc.DigitalVideoDisc;
import Store.Store;

/**
 *
 * @author HP
 */
public class StoreTest {
    public static void main(String[] args) {
        // Tạo cửa hàng
        Store store = new Store();

        // Tạo một số DVD
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");

        // Thêm DVD vào cửa hàng
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);

        // Hiển thị các DVD hiện có trong cửa hàng
        store.displayItems();

        // Xóa một DVD khỏi cửa hàng
        store.removeDVD("Star Wars");

        // Hiển thị lại các DVD trong cửa hàng
        store.displayItems();

        // Thử xóa một DVD không tồn tại
        store.removeDVD("Harry Potter");
    }
}
