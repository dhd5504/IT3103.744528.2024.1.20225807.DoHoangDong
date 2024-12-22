/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hust.soict.globalict.swing;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author HP
 */
public class AWTAccumulator extends Frame {
    private TextField tfInput;    // Ô nhập dữ liệu
    private TextField tfOutput;   // Ô hiển thị kết quả
    private int sum = 0;          // Tổng tích lũy ban đầu là 0

    // Constructor để thiết lập giao diện và các sự kiện
    public AWTAccumulator() {
        setLayout(new GridLayout(2, 2)); // Layout dạng lưới 2x2

        // Nhãn và ô nhập dữ liệu
        add(new Label("Enter an Integer: "));
        tfInput = new TextField(10);
        add(tfInput);
        tfInput.addActionListener(new TFInputListener());

        // Nhãn và ô hiển thị kết quả
        add(new Label("The Accumulated Sum is: "));
        tfOutput = new TextField(10);
        tfOutput.setEditable(false); // Không cho chỉnh sửa kết quả
        add(tfOutput);

        // Cài đặt cửa sổ
        setTitle("AWT Accumulator");
        setSize(350, 120);
        setVisible(true);
    }

    // Hàm main để chạy chương trình
    public static void main(String[] args) {
        new AWTAccumulator();
    }

    // Lớp xử lý sự kiện khi nhấn Enter trong ô nhập
    private class TFInputListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            int numberIn = Integer.parseInt(tfInput.getText()); // Lấy số nguyên từ ô nhập
            sum += numberIn; // Cộng dồn vào tổng
            tfInput.setText(""); // Xóa ô nhập
            tfOutput.setText(sum + ""); // Hiển thị tổng tích lũy
        }
    }
}
