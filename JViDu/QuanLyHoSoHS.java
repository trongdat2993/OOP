/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyHoSoHocSinh;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author trong
 */
public class QuanLyHoSoHS {

    public void search(int year, ArrayList<HoSoHocSinh> hs) {
        for (HoSoHocSinh h : hs) {
            if (h.hocSinh.getYear() == year) {
                h.outputData();
            }
        }
    }

    public int countHs(int year, String diaChi, ArrayList<HoSoHocSinh> hs) {
        int count = 0;
        for (HoSoHocSinh h : hs) {
            if (h.hocSinh.getYear() == year && h.hocSinh.getQueQuan().equals(diaChi)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        QuanLyHoSoHS test = new QuanLyHoSoHS();
        ArrayList<HoSoHocSinh> hoSoHocSinh = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so luong ho so: ");
        int soLuong = input.nextInt();
        for (int i = 0; i < soLuong; i++) {
            HoSoHocSinh hoSoHs = new HoSoHocSinh();
            hoSoHs.inputHocSinh();
            hoSoHocSinh.add(hoSoHs);
        }

        System.out.println("Ho so hoc sinh");
        for (HoSoHocSinh hs : hoSoHocSinh) {
            hs.outputData();
        }
        
        System.out.println("Danh sach hoc sinh sinh nam 1985");
        test.search(1985, hoSoHocSinh);
        
        System.out.println("So hoc sinh sinh nam 1985 va que Thai Nguyen: " + test.countHs(1985, "Thai Nguyen", hoSoHocSinh));
    }
}
