/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package de5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author trong
 */
public class De5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so luong thi sinh: ");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int choice = 0;
            System.out.println("1.Them khoi A\n2.Them khoi C");
            choice = input.nextInt();
            if (choice == 1) {
                KhoiA kA = new KhoiA();
                kA.Nhap();
                list.add(kA);
            } else if (choice == 2) {
                KhoiC kC = new KhoiC();
                kC.Nhap();
                list.add(kC);
            }
        }

        System.out.println("DANH SACH KHOI A: ");
        for (Object ts : list) {
            if (ts instanceof KhoiA) {
                if (((KhoiA) ts).TinhDiem() > 20) {
                    ((KhoiA) ts).Xuat();
                }
            }
        }

        System.out.println("DANH SACH KHOI C: ");
        for (Object ts : list) {
            if (ts instanceof KhoiC) {
                if (((KhoiC) ts).TinhDiem() > 20) {
                    ((KhoiC) ts).Xuat();
                }
            }
        }
    }

}
