/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.hust.soict.hedspi.aims.Cart;
// Do Hoang Dong 20225807
import java.util.ArrayList;
import java.util.Collections;
import javafx.collections.ObservableList;
import src.hust.soict.hedspi.aims.media.DigitalVideoDisc;
import src.hust.soict.hedspi.aims.media.Media;

/**
 *
 * @author HP
 */
public class Cart {
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    public void addMedia(Media item) {
        if(itemsOrdered.contains(item)) {
            System.out.println(item.getTitle() + "is already in the cart !");
        } else {
            itemsOrdered.add(item);
            System.out.println(item.getTitle() + " is now in your cart !");
        }
    }

    public void removeMedia(Media item) {
        if(itemsOrdered.contains(item)) {
            itemsOrdered.remove(item);
        } else {
            System.out.println(item.getClass().getSimpleName() + ' ' + item.getTitle() + " is not in the cart !");
        }
    }

    public float totalCost() {
        float sum = 0;
        for (Media item : itemsOrdered) {
            sum += item.getCost();
        }
        return sum;
    }

    public void print() {
        StringBuilder output = new StringBuilder("*************CART************************** \nOrdered items: \n");
        if(itemsOrdered.isEmpty()) {
            output.append("No time\n");
        } else {
            int i = 1;
            for (Media item : itemsOrdered) {
                output.append(i + ".[" + item.getTitle() + "] - [" + item.getCategory() + "] - "
                        + item.getCost() + " $\n");
                i++;
            }
        }
        output.append("total: ").append(totalCost()).append(" $\n");
        output.append("================================================\n");
        System.out.println(output);
    }

    public void searchById(int i) {
        if(i > itemsOrdered.size()) {
            System.out.println("No match found !");
        } else {
            System.out.println("Result: " +  "[" + itemsOrdered.get(i-1).getTitle() +
                    "] - [" + itemsOrdered.get(i-1).getCategory() + "] -"
                    +  + itemsOrdered.get(i-1).getCost() + " $\n");
        }
    }

    public void searchByTitle(String title) {
        for(Media item : itemsOrdered) {
            if(item.getTitle().equals(title)) {
                System.out.println("Result: " +  "[" + item.getTitle() +
                        "] - [" + item.getCategory() + "] -"
                        +item.getCost() + " $\n");
                return;
            }
        }
        System.out.println("No match found");
    }

    public Media findMedia(String title) {
        for (Media item : itemsOrdered) {
            if (item.getTitle().equals(title)) {
                return item;
            }
        }
        return null;
    }

    public void emptyCart() {
        itemsOrdered.removeAll(itemsOrdered);
    }

    public void sortByTitleCost() {
        Collections.sort(itemsOrdered,Media.COMPARE_BY_TITLE_COST);
    }

    public void sortByCostTitle() {
        Collections.sort(itemsOrdered,Media.COMPARE_BY_COST_TITLE);
    }

    public ObservableList<Media> getItemsOrdered() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
//public class Cart {
//
//    public static final int MAX_NUMBERS_ORDERED = 20;
//    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
//
//    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
//        for (int i = 0; i < MAX_NUMBERS_ORDERED; i++) {
//            if (itemsOrdered[i] == null) {
//                itemsOrdered[i] = disc;
//                System.out.println("The disc has been added");
//                return;
//            }
//        }
//        System.out.println("The cart is almost full");
//    }
//
//    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
//        for (DigitalVideoDisc dvd : dvdList) {
//            if (dvd != null) { // Kiểm tra nếu DVD hợp lệ
//                boolean added = false;
//                for (int i = 0; i < MAX_NUMBERS_ORDERED; i++) {
//                    if (itemsOrdered[i] == null) {
//                        itemsOrdered[i] = dvd;
//                        System.out.println("Added DVD: " + dvd.getTitle());
//                        added = true;
//                        break;
//                    }
//                }
//                if (!added) {
//                    System.out.println("The cart is almost full");
//                }
//            } else {
//                System.out.println("Invalid DVD found in the list. Skipping...");
//            }
//        }
//    }
//
//    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
//        if (dvd1 != null) {
//            for (int i = 0; i < MAX_NUMBERS_ORDERED; i++) {
//                if (itemsOrdered[i] == null) { // Tìm vị trí trống trong mảng
//                    itemsOrdered[i] = dvd1;
//                    System.out.println("Added DVD: " + dvd1.getTitle());
//                    break;
//                }
//            }
//        }
//
//        if (dvd2 != null) {
//            for (int i = 0; i < MAX_NUMBERS_ORDERED; i++) {
//                if (itemsOrdered[i] == null) { // Tìm vị trí trống trong mảng
//                    itemsOrdered[i] = dvd2;
//                    System.out.println("Added DVD: " + dvd2.getTitle());
//                    break;
//                }
//            }
//        }
//    }
//    
//
//    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
//        for (int i = 0; i < MAX_NUMBERS_ORDERED; i++) {
//            if (itemsOrdered[i] == disc) {
//                itemsOrdered[i] = null;
//                System.out.println("The disc has been removed");
//                break;
//            }
//        }
//    }
//
//    public float totalCost() {
//        float totalCost = 0;
//        for (int i = 0; i < MAX_NUMBERS_ORDERED; i++) {
//            if (itemsOrdered[i] != null) {
//                totalCost += itemsOrdered[i].getCost();
//            }
//        }
//        return totalCost;
//    }
//
//    public void playDemo(DigitalVideoDisc disc) {
//        if (disc.getLength() <= 0) {
//            System.out.println("DVD cannot be played.");
//        } else {
//            System.out.println("Playing DVD: " + disc.getTitle());
//        }
//    }
//    // public void browseDVD() {
//    //   Arrays.sort(itemsOdered, (a, b) -> {
//    //       if (a == null) return 1;
//    //       if (b == null) return -1; 
//    //       return a.getDate().compareTo(b.getDate());
//    //   });
//    //   for(int i = 0 ; i < MAX_NUMBERS_ORDERED; i++) {
//    //     if(itemsOdered[i] != null) System.out.println(itemsOdered[i].getDate());
//    //   }
//    // }
//
//    public void print() {
//        StringBuilder output = new StringBuilder("*********************CART************************** \nOrdered items: \n");
//        for (int i = 0; i < MAX_NUMBERS_ORDERED; i++) {
//            if (itemsOrdered[i] != null) {
//                output.append(i + 1
//                        + ".["
//                        + itemsOrdered[i].getTitle()
//                        + "] - ["
//                        + itemsOrdered[i].getCategory()
//                        + "] - ["
//                        + itemsOrdered[i].getDirector() + "] - [" + itemsOrdered[i].getLength() + "]: "
//                        + itemsOrdered[i].getCost() + " $\n");
//            }
//        }
//        output.append("total: ").append(totalCost()).append(" $\n");
//        output.append("***************************************************\n");
//        System.out.println(output);
//    }
//
//    // Search DVD by ID
//    public void searchById(int i) {
//        if (i > MAX_NUMBERS_ORDERED || itemsOrdered[i] == null) {
//            System.out.println("No match found !");
//        } else {
//            System.out.println("Result: " + "[" + itemsOrdered[i - 1].getTitle()
//                    + "] - [" + itemsOrdered[i - 1].getCategory() + "] - ["
//                    + itemsOrdered[i - 1].getDirector() + "] - ["
//                    + itemsOrdered[i - 1].getLength() + "]: " + itemsOrdered[i - 1].getCost() + " $\n");
//        }
//
//    }
//
//    public void searchByTitle(String title) {
//        for (int i = 0; i < MAX_NUMBERS_ORDERED; i++) {
//            if (itemsOrdered[i] != null) {
//                if (itemsOrdered[i].getTitle().toLowerCase().contains(title.toLowerCase())) {
//                    System.out.println("Result: " + "[" + itemsOrdered[i].getTitle()
//                            + "] - [" + itemsOrdered[i].getCategory() + "] - ["
//                            + itemsOrdered[i].getDirector() + "] - ["
//                            + itemsOrdered[i].getLength() + "]: " + itemsOrdered[i].getCost() + " $\n");
//                    return;
//                }
//            }
//        }
//        System.out.println("No match found !");
//    }
//}
