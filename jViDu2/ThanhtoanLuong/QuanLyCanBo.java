/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyThanhToanLuong;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author trong
 */
public class QuanLyCanBo {
    public static void main(String[] args) {
        ArrayList<CanBoGV> listCanBo = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so luong: ");
        int soLuong = input.nextInt();
        for (int i = 0; i < soLuong; i++) {
            CanBoGV canBo = new CanBoGV();
            canBo.inputData();
            listCanBo.add(canBo);
        }
        
        System.out.println("Thong tin can bo: ");
        for (CanBoGV canBoGV : listCanBo) {
            canBoGV.outputData();
        }
    }
}
