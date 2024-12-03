// DO Hoang DOng 20225807
package src.hust.soict.hedspi.aims.media;
public class DigitalVideoDisc extends Disc implements Playable{


    public DigitalVideoDisc(int id, String title, String category, float cost, String director, float length) {
        super(id, title, category, cost, director, length);
    }

    public  DigitalVideoDisc(int id, String title, String category, float cost){
        super(id,title,category,cost);
    }



    public void play(){
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}




// public class DigitalVideoDisc {
//     private static int nbDigitalVideoDiscs = 0; //Mai Minh Quân - 20225661 - Class attribute 
//     private String title;
//     private String category;
//     private String director;
//     private int length;
//     private float cost;
//     private int id; 

//     //Phương thức khởi dựng các thông tin của đĩa DVD
//     //Các phương thức khởi dựng trên nạp chồng

//     public DigitalVideoDisc(String title) {
//         super();
//         this.title = title;
//         this.id = ++nbDigitalVideoDiscs; // Update class variable and assign id
//     }

//     public DigitalVideoDisc(String title, String category, float cost) {
//         this.title = title;
//         this.category = category;
//         this.cost = cost;
//         this.id = ++nbDigitalVideoDiscs; // Update class variable and assign id
//     }
//     public DigitalVideoDisc(String title, String category, String director, float cost) {
//         this.title = title;
//         this.category = category;
//         this.director = director;
//         this.cost = cost;
//         this.id = ++nbDigitalVideoDiscs; // Update class variable and assign id
//     }

//     public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
//         this.title = title;
//         this.category = category;
//         this.director = director;
//         this.length = length;
//         this.cost = cost;
//         this.id = ++nbDigitalVideoDiscs; // Update class variable and assign id
//     }

//     public String getTitle() { return title; }

//     public String getCategory() { return category; }


//     public int getLength() { return length; }

//     public float getCost() { return cost; }
//     public int getId() { return id; } // Ham lay id

//     public void setTitle(String titleSet){ title = titleSet; }
//     public void setCategory(String categorySet){ category = categorySet; }
//     public void setDirector(String directorSet){ director = directorSet; }
//     public void setLength(int lengthSet){ length = lengthSet; }
//     public void setCost(float costSet){ cost = costSet; }
// }
