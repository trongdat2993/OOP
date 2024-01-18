/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyKhachHang;

/**
 *
 * @author trong
 */
public class Person {

    private String hoTen;
    private String soCCCD;
    private int tuoi;
    private int namSinh;

    public Person() {
    }

    public Person(String hoTen, String soCCCD, int tuoi, int namSinh) {
        this.hoTen = hoTen;
        this.soCCCD = soCCCD;
        this.tuoi = tuoi;
        this.namSinh = namSinh;
    }

    public void outputData() {
        System.out.printf("%-15s | %-12s | %2d | %4d | ", this.hoTen, this.soCCCD, this.tuoi, this.namSinh);
    }
}
