/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aims;

import Cart.Cart;
import Disc.DigitalVideoDisc;

/**
 *
 * @author HP
 */
public class Aims {
    public static void main(String[] args) {
//       Cart anOrCart = new Cart();

//addDigitalVideoDisc(DigitalVideoDisc disc)        
//        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
//        anOrCart.addDigitalVideoDisc(dvd1);
//        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);
//        anOrCart.addDigitalVideoDisc(dvd2);
//        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
//        anOrCart.addDigitalVideoDisc(dvd3);
//        anOrCart.removeDigitalVideoDisc(dvd3);
//        System.out.println("Total Cost is: ");
//        System.out.println(anOrCart.totalCost());



        Cart cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 89, 19.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Aladdin", "Animation", "Ron Clements", 90, 24.99f);        
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Beauty and the Beast", "Animation", "Gary Trousdale", 84, 21.99f);
        
//addDigitalVideoDisc(DigitalVideoDisc[] disc)       
        DigitalVideoDisc[] dvdArray = {dvd1, dvd2, dvd3};
        // Thêm DVD vào giỏ
        cart.addDigitalVideoDisc(dvdArray);
        
////addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2)
//        cart.addDigitalVideoDisc(dvd1,dvd2);

   cart.print();
   cart.searchByTitle("be");
   }
}
