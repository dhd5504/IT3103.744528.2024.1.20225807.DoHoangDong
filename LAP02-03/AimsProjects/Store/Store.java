/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Store;

/**
 *
 * @author HP
 */
import Disc.DigitalVideoDisc;
import java.util.ArrayList;

class Store {
    // Danh sách các DVD trong cửa hàng
    private ArrayList<DigitalVideoDisc> itemsInStore;

    // Constructor
    public Store() {
        this.itemsInStore = new ArrayList<>();
    }

    // Phương thức thêm DVD vào cửa hàng
    public void addDVD(DigitalVideoDisc dvd) {
        itemsInStore.add(dvd);
        System.out.println("Added DVD: " + dvd.getTitle());
    }

    // Phương thức xóa DVD khỏi cửa hàng
    public void removeDVD(String title) {
        boolean removed = false;
        for (DigitalVideoDisc dvd : itemsInStore) {
            if (dvd.getTitle().equalsIgnoreCase(title)) {
                itemsInStore.remove(dvd);
                System.out.println("Removed DVD: " + dvd.getTitle());
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("DVD with title '" + title + "' not found.");
        }
    }

    // Phương thức hiển thị danh sách DVD
    public void displayItems() {
        if (itemsInStore.isEmpty()) {
            System.out.println("The store is empty.");
        } else {
            System.out.println("DVDs available in the store:");
            for (DigitalVideoDisc dvd : itemsInStore) {
                System.out.println("- " + dvd.getTitle());
            }
        }
    }
}

