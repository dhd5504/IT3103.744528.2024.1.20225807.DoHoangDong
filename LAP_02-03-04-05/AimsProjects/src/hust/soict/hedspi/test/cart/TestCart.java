/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.hust.soict.hedspi.test.cart;

import src.hust.soict.hedspi.aims.Cart.Cart;
import src.hust.soict.hedspi.aims.media.DigitalVideoDisc;

/**
 *
 * @author HP
 */
public class TestCart {
        public static void main(String[] args) {
        Cart cart = new Cart();
//        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation",
//                "Roger Allers",87,19.95f);
//        cart.addDigitalVideoDisc(dvd1);
//        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star wars","Science Fiction",
//                "Geogre Lucas",87,24.95f);
//        cart.addDigitalVideoDisc(dvd2);
//        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
//        cart.addDigitalVideoDisc(dvd3);

        cart.print();

        //Test search by ID method
        cart.searchById(3);
        cart.searchById(4);

        //Test search by Title method
        cart.searchByTitle("The Lion King");
        cart.searchByTitle("Alan Walker");
    }
}
