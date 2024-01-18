/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyHoSoHocSinh;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author trong
 */
public class HoSoHocSinh implements Serializable{

    String Lop;
    String khoaHoc;
    int kyHoc;
    HocSinh hocSinh;

    public HoSoHocSinh() {
    }

    public HoSoHocSinh(String Lop, String khoaHoc, int kyHoc, HocSinh hocSinh) {
        this.Lop = Lop;
        this.khoaHoc = khoaHoc;
        this.kyHoc = kyHoc;
        this.hocSinh = hocSinh;
    }

    public void inputHocSinh() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        String hoTen = input.nextLine();
        System.out.println("Nhap que quan: ");
        String queQuan = input.nextLine();
        System.out.println("Nhap lop: ");
        Lop = input.nextLine();
        System.out.println("Nhap khoa hoc: ");
        khoaHoc = input.nextLine();
        System.out.println("Nhap ky hoc: ");
        kyHoc = input.nextInt();
        System.out.println("Nhap tuoi: ");
        int age = input.nextInt();
        System.out.println("Nhap nam sinh: ");
        int year = input.nextInt();
        hocSinh = new HocSinh(hoTen, queQuan, age, year);
    }

    public void outputData() {
        hocSinh.outputData();
        System.out.printf("| %-5s | %-5s | %1d |\n", this.Lop, this.khoaHoc, this.kyHoc);
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        File file = new File("D:\\Sinh vien.txt");
        FileOutputStream fOS = new FileOutputStream(file);
        ObjectOutputStream oOS = new ObjectOutputStream(fOS);
        HoSoHocSinh hs = new HoSoHocSinh();
        hs.inputHocSinh();
        oOS.writeObject(hs);
        oOS.close();
        
        FileInputStream fIS = new FileInputStream(file);
        ObjectInputStream oIS = new ObjectInputStream(fIS);
        HoSoHocSinh hs1 = (HoSoHocSinh) oIS.readObject();
        hs.outputData();
        oIS.close();      
    }
}
