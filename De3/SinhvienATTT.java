/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de3;

/**
 *
 * @author trong
 */
public class SinhvienATTT extends Sinhvien{
    private float hocPhi;

    public SinhvienATTT() {
    }

    public SinhvienATTT(float hocPhi, String maSV, String hoTen, String ngaySinh, String gioiTinh, float diemTB) {
        super(maSV, hoTen, ngaySinh, gioiTinh, diemTB);
        this.hocPhi = hocPhi;
    }

    public float getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(float hocPhi) {
        this.hocPhi = hocPhi;
    }

    @Override
    public String toString() {
        return super.toString() + "SinhvienATTT{" + "hocPhi=" + hocPhi + '}';
    }
}
