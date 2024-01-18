/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de5;

import java.util.Scanner;

/**
 *
 * @author trong
 */
public class ThiSinh {
    private String hoTen;
    private String ngaySinh;
    private String diaChi;

    public ThiSinh() {
    }

    public ThiSinh(String hoTen, String ngaySinh, String diaChi) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }
    
    public void Nhap(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        hoTen = input.nextLine();
        System.out.println("Nhap ngay sinh: ");
        ngaySinh = input.nextLine();
        System.out.println("Nhap dia chi: ");
        diaChi = input.nextLine();
    }
    
    public void Xuat(){
        System.out.printf("| %-15s | %-15s | %-15s |", this.hoTen, this.ngaySinh, this.diaChi);
    }
}
