/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAP_01;

/**
 *
 * @author HP
 */
import javax.swing.JOptionPane;

public class Bai_2_2_5 {

    public static void main(String[] args) {
        String strNum1, strNum2;
        strNum1 = JOptionPane.showInputDialog("Input the first number");
        strNum2 = JOptionPane.showInputDialog("Input the second number");
        Double num1 = Double.parseDouble(strNum1);
        Double num2 = Double.parseDouble(strNum2);
        if (num2 == 0) {
            JOptionPane.showMessageDialog(null, "cannot be divided by 0!");
        } else {
            JOptionPane.showMessageDialog(null, " Sum : %f \n difference %f \n product  = %f \n and quotient =  %f"
                    .formatted(num1 + num2, num1 - num2, num1 * num2, num1 / num2),
                    "Result: ", JOptionPane.INFORMATION_MESSAGE);
        }
        System.exit(0);
    }
}
