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
public class KhoiC extends ThiSinh{
    private float van;
    private float su;
    private float dia;

    public KhoiC() {
    }

    public KhoiC(float van, float su, float dia, String hoTen, String ngaySinh, String diaChi) {
        super(hoTen, ngaySinh, diaChi);
        this.van = van;
        this.su = su;
        this.dia = dia;
    }

    @Override
    public void Nhap() {
        super.Nhap(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap diem van, su, dia: ");
        van = input.nextFloat();
        su = input.nextFloat();
        dia = input.nextFloat();
    }
    
    public float TinhDiem(){
        return van + su + dia;
    }
    
    @Override
    public void Xuat() {
        super.Xuat(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.printf(" | %.2f | %.2f | %.2f |\n", van, su, dia);
    } 
}
