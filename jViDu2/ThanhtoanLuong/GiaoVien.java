/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyThanhToanLuong;

/**
 *
 * @author trong
 */
public class GiaoVien {

    private String hoTen;
    private String queQuan;
    private int year;

    public GiaoVien() {
    }

    public GiaoVien(String hoTen, String queQuan, int year) {
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.year = year;
    }

    public void outputData() {
        System.out.printf("| %-15s | %-15s | %4d |", this.hoTen, this.queQuan, this.year);
    }
}
