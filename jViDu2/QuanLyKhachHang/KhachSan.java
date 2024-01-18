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
public class KhachSan {

    int ngay;
    int thang;
    int nam;
    int loaiTro;
    float giaTro;
    Person person;

    public KhachSan() {
    }

    public KhachSan(int ngay, int thang, int nam, int loaiTro, float giaTro, Person person) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
        this.loaiTro = loaiTro;
        this.giaTro = giaTro;
        this.person = person;
    }

    public void inputData() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        String hoTen = input.nextLine();
        System.out.println("Nhap so chung minh nhan dan: ");
        String soCCCD = input.nextLine();
        System.out.println("Nhap tuoi: ");
        int tuoi = input.nextInt();
        System.out.println("Nhap nam sinh: ");
        int namSinh = input.nextInt();
        System.out.println("Nhap ngay/thang/nam: ");
        ngay = input.nextInt();
        thang = input.nextInt();
        nam = input.nextInt();
        System.out.println("Nhap loai tro: ");
        loaiTro = input.nextInt();
        System.out.println("Nhap gia tro: ");
        giaTro = input.nextFloat();
        person = new Person(hoTen, soCCCD, tuoi, namSinh);
    }

    public void outputData() {
        person.outputData();
        System.out.printf("%2d/%2d/%4d | %d | %.2f |\n", this.ngay, this.thang, this.nam, this.loaiTro, this.giaTro);
    }
}
