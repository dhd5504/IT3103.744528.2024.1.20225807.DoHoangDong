/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAP_01;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Bai_6_3 {
  public static void main(String[] args) {
    Scanner keyborad = new Scanner(System.in);
    
    System.out.println("height of stars?");
    int n = keyborad.nextInt();

    for(int i = 0; i < n; i++){
      for(int k = n - i; k > 0; k--){
        System.out.print(" ");
      }
      for(int j = 2*i+1; j > 0; j--){
        System.out.print("*");
      }
      System.out.println();
  }
  }

}
