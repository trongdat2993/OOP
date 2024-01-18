/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyThanhToanLuong;

import java.util.Scanner;

/**
 *
 * @author trong
 */
public class CanBoGV {

    float luongCung;
    float thuong;
    float phat;
    GiaoVien giaoVien;
    float luongThucLinh;

    public CanBoGV() {
    }

    public CanBoGV(float luongCung, float thuong, float phat, GiaoVien giaoVien) {
        this.luongCung = luongCung;
        this.thuong = thuong;
        this.phat = phat;
//        this.luongThucLinh = this.luongCung + this.thuong - this.phat;
        this.giaoVien = giaoVien;
    }

    public void inputData() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        String hoTen = input.nextLine();
        System.out.println("Nhap que quan: ");
        String queQuan = input.nextLine();
        System.out.println("Nhap nam sinh: ");
        int year = input.nextInt();
        System.out.println("Nhap luong cung: ");
        luongCung = input.nextFloat();
        System.out.println("Nhap thuong: ");
        thuong = input.nextFloat();
        System.out.println("Nhap phat: ");
        phat = input.nextFloat();
        giaoVien = new GiaoVien(hoTen, queQuan, year);
    }

    public void outputData() {
        this.luongThucLinh = this.luongCung + this.thuong - this.phat;
        giaoVien.outputData();
        System.out.printf(" %.2f | %.2f | %.2f | %.2f |\n", this.luongCung, this.thuong, this.phat, this.luongThucLinh);
    }

}
