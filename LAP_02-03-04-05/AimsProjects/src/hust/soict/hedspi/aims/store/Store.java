/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.hust.soict.hedspi.aims.store;
// Do Hoang Dong 20225807

import java.util.*;
import src.hust.soict.hedspi.aims.media.DigitalVideoDisc;
import src.hust.soict.hedspi.aims.media.Media;

/**
 *
 * @author HP
 */
public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public ArrayList<Media> getItemsInStore() {
		return itemsInStore;
	}


    // Add and remove media from the store
    public void addMedia(Media media) {
        if (itemsInStore.contains(media)) {
            System.out.println("The media " + media.getTitle() + " is already in the store!");
        } else {
            itemsInStore.add(media);
            System.out.println("The media " + media.getTitle() + " has been added to the store.");
        }
    }
    public void removeMedia(Media media) {
        if (itemsInStore.remove(media)) {
            System.out.println("The media " + media.getTitle() + " has been removed from the store.");
        } else {
            System.out.println("The media " + media.getTitle() + " is not in the store!");
        }
    }

    // Print the store
    public void print() {
        if (itemsInStore.size() == 0) {
            System.out.println("The store is empty!");
        } else {
            System.out.println("********************STORE INVENTORY********************");
            for (Media media : itemsInStore) {
                System.out.println(media);
            }
            System.out.println("********************************************************");
        }
    }

    public Media search(String title) {
		for (Media media : itemsInStore) {
			if (media.getTitle().equals(title)) {
				return media;
			}
		}
		return null;
	}
        public Media findMedia(String title) {
        for (Media item : itemsInStore) {
            if (item.getTitle().equals(title)) {
                return item;
            }
        }
        return null;
    }
            @Override
    public String toString() {
        StringBuilder string = new StringBuilder("\n**********STORE***************\nitems in the store: \n");
        if (itemsInStore.isEmpty()) {
            string.append("There is no dvd in the store !\n");
        } else {
            for (Media item : itemsInStore) {
                string.append(item.getTitle() + " - " + item.getCost() + " $\n");
            }
        }
        string.append("*********************************\n");
        return string.toString();
    }
}

//    private LinkedList<Media> itemsInStore = new LinkedList<Media>();
//
//    private boolean checkMedia(Media disc) {
//        for (Media item : itemsInStore) {
//            if (item.equals(disc)) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public Media findMedia(String title) {
//        for (Media item : itemsInStore) {
//            if (item.getTitle().equals(title)) {
//                return item;
//            }
//        }
//        return null;
//    }
//
//    public LinkedList<Media> getItemsInStore() {
//        return itemsInStore;
//    }
//
//    public void removeMedia(Media disc) {
//        if (checkMedia(disc)) {
//            itemsInStore.remove(disc);
//            System.out.println(disc.getTitle() + " 've been deleted from the store !");
//        } else {
//            System.out.println("There is no " + disc.getTitle() + " in the store !");
//        }
//    }
//
//    public void addMedia(Media disc) {
//        if (!checkMedia(disc)) {
//            itemsInStore.add(disc);
//            System.out.println(disc.getTitle() + " 've been added to the store !");
//        } else {
//            System.out.println(disc.getTitle() + " 'already exists in the store !");
//        }
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder string = new StringBuilder("\n**********STORE***************\nitems in the store: \n");
//        if (itemsInStore.isEmpty()) {
//            string.append("There is no dvd in the store !\n");
//        } else {
//            for (Media item : itemsInStore) {
//                string.append(item.getTitle() + " - " + item.getCost() + " $\n");
//            }
//        }
//        string.append("*********************************\n");
//        return string.toString();
//    }
//}
//public class Store {
//
//    private LinkedList<DigitalVideoDisc> itemsInStore = new LinkedList<DigitalVideoDisc>();
//
//    private boolean checkDVD(DigitalVideoDisc disc) {
//        for (DigitalVideoDisc digitalVideoDisc : itemsInStore) {
//            if (digitalVideoDisc.equals(disc)) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public void removeDVD(DigitalVideoDisc disc) {
//        if (checkDVD(disc)) {
//            itemsInStore.remove(disc);
//            System.out.println(disc.getTitle() + " 've been deleted from the store !");
//        } else {
//            System.out.println("There is no " + disc.getTitle() + " in the store !");
//        }
//    }
//
//    public void addDVD(DigitalVideoDisc disc) {
//        if (!checkDVD(disc)) {
//            itemsInStore.add(disc);
//            System.out.println(disc.getTitle() + " 've been added to the store !");
//        } else {
//            System.out.println(disc.getTitle() + " 'already exists in the store !");
//        }
//
//    }
//
//    @Override //Dinh nghia lai phuong thuc trong lop Object cua thu vien java.lang
//    public String toString() {
//        StringBuilder string = new StringBuilder("****************STORE***************\nitems in the store: \n");
//        if (itemsInStore.isEmpty()) {
//            string.append("There is no dvd in the store !\n");
//        } else {
//            for (DigitalVideoDisc dvd : itemsInStore) {
//                string.append(dvd.getTitle() + " - " + dvd.getCost() + " $\n");
//            }
//        }
//        string.append("***************************************");
//        return string.toString();
//    }
//}
