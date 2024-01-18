/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de3;

/**
 *
 * @author trong
 */
public class SinhvienMatMa extends Sinhvien{
        private String donVi;
        private float luong;

    public SinhvienMatMa() {
    }

    public SinhvienMatMa(String donVi, float luong, String maSV, String hoTen, String ngaySinh, String gioiTinh, float diemTB) {
        super(maSV, hoTen, ngaySinh, gioiTinh, diemTB);
        this.donVi = donVi;
        this.luong = luong;
    }
    
    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return super.toString() + "SinhvienMatMa{" + "donVi=" + donVi + ", luong=" + luong + '}';
    }
}
