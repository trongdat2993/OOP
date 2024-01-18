/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyHoSoHocSinh;

import java.io.Serializable;

/**
 *
 * @author trong
 */
public class HocSinh implements Serializable{

    private String hoTen;
    private String queQuan;
    private int age;
    private int year;

    public HocSinh() {
    }

    public HocSinh(String hoTen, String queQuan, int age, int year) {
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.age = age;
        this.year = year;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void outputData() {
        System.out.printf("| %-15s | %-15s | %2d | %4d ", this.hoTen, this.queQuan, this.age, this.year);
    }
}
