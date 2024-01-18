/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyKhachHang;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author trong
 */
public class QLKH {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<KhachSan> listKS = new ArrayList<>();
        System.out.println("Nhap so luong: ");
        int soLuong = input.nextInt();
        for (int i = 0; i < soLuong; i++) {
            KhachSan khachSan = new KhachSan();
            khachSan.inputData();
            listKS.add(khachSan);
        }
        
        System.out.println("Thong tin ca nhan: ");
        for (KhachSan ks : listKS) {
            ks.outputData();
        }
    }
}
