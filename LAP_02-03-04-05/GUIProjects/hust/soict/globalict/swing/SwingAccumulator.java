/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hust.soict.globalict.swing;

/**
 *
 * @author HP
 */
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;

public class SwingAccumulator extends JFrame {
    private JTextField tfInput;    // Ô nhập số nguyên
    private JTextField tfOutput;   // Ô hiển thị kết quả
    private int sum = 0;           // Tổng tích lũy, khởi tạo bằng 0

    // Constructor để thiết lập giao diện và các xử lý sự kiện
    public SwingAccumulator() {
        Container cp = getContentPane();
        cp.setLayout(new GridLayout(2, 2)); // Layout dạng lưới 2x2

        // Nhãn và ô nhập dữ liệu
        cp.add(new JLabel("Enter an Integer: "));
        tfInput = new JTextField(10);
        cp.add(tfInput);
        tfInput.addActionListener(new TFInputListener());

        // Nhãn và ô hiển thị kết quả
        cp.add(new JLabel("The Accumulated Sum is: "));
        tfOutput = new JTextField(10);
        tfOutput.setEditable(false); // Không cho phép chỉnh sửa ô kết quả
        cp.add(tfOutput);

        // Cài đặt cửa sổ JFrame
        setTitle("Swing Accumulator");
        setSize(350, 120);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Đóng cửa sổ khi thoát
    }

    // Hàm main để chạy chương trình
    public static void main(String[] args) {
        new SwingAccumulator();
    }

    // Lớp xử lý sự kiện khi nhấn Enter trong ô nhập
    private class TFInputListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            int numberIn = Integer.parseInt(tfInput.getText()); // Lấy số nguyên từ ô nhập
            sum += numberIn; // Cộng dồn vào tổng tích lũy
            tfInput.setText(""); // Xóa nội dung ô nhập
            tfOutput.setText(sum + ""); // Hiển thị tổng tích lũy
        }
    }
}
