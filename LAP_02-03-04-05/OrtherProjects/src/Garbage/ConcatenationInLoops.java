/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrtherPojects;

import java.util.Random;

/**
 *
 * @author HP
 */
public class ConcatenationInLoops {
    public static void main(String[] args) {
        // Sử dụng String để nối chuỗi
        Random r = new Random(123); // Khởi tạo bộ sinh số ngẫu nhiên với seed = 123
        long start = System.currentTimeMillis(); // Lấy thời gian bắt đầu
        String s = "";
        for (int i = 0; i < 65536; i++) {
            s += r.nextInt(2); // Thêm số ngẫu nhiên vào chuỗi
        }
        System.out.println(System.currentTimeMillis() - start); // In thời gian thực thi
        // Ghi chú: Dòng này in khoảng 4500 ms (tùy vào cấu hình máy).

        // Sử dụng StringBuilder để nối chuỗi
        r = new Random(123); // Tạo lại bộ sinh số ngẫu nhiên
        start = System.currentTimeMillis(); // Lấy thời gian bắt đầu
        StringBuilder sb = new StringBuilder(); // Sử dụng StringBuilder để tối ưu
        for (int i = 0; i < 65536; i++) {
            sb.append(r.nextInt(2)); // Thêm số ngẫu nhiên vào StringBuilder
        }
        s = sb.toString(); // Chuyển đổi StringBuilder thành chuỗi
        System.out.println(System.currentTimeMillis() - start); // In thời gian thực thi
        // Ghi chú: Dòng này in khoảng 5 ms (tùy vào cấu hình máy).
    }
}
