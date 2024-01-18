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
public class KhoiA extends ThiSinh{
    private float toan;
    private float ly;
    private float hoa;

    public KhoiA() {
    }

    public KhoiA(float toan, float ly, float hoa, String hoTen, String ngaySinh, String diaChi) {
        super(hoTen, ngaySinh, diaChi);
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    @Override
    public void Nhap() {
        super.Nhap(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap diem toan, ly, hoa: ");
        toan = input.nextFloat();
        ly = input.nextFloat();
        hoa = input.nextFloat();
    }
    
    public float TinhDiem(){
        return toan + ly + hoa;
    }
    @Override
    public void Xuat() {
        super.Xuat(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.printf(" | %.2f | %.2f | %.2f |\n", toan, ly, hoa);
    }  
}
