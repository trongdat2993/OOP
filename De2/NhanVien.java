        /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de2;

/**
 *
 * @author trong
 */
public class NhanVien extends Person{
    private String phongBan;
    private int heSL;
    private int thamNien;
    private float luongCB;

    public NhanVien() {
    }

    public NhanVien(String phongBan, int heSL, int thamNien, float luongCB, String hoTen, String ngaySinh, String diaChi, String gioiTinh) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.phongBan = phongBan;
        this.heSL = heSL;
        this.thamNien = thamNien;
        this.luongCB = luongCB;
        
    }
    
    public float luongThucLinh(int heSL, int thamNien, float luongCB){
        return (float)(heSL * luongCB * (float)(1 + thamNien/100));
    }
    @Override
    public String toString() {
        return super.toString() + "NhanVien{" + "phongBan=" + phongBan + ", heSL=" + heSL + ", thamNien=" + thamNien + ", luongCB=" + luongCB + ", luongTL=" + luongThucLinh(heSL,thamNien, luongCB) + '}';
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public int getHeSL() {
        return heSL;
    }

    public void setHeSL(int heSL) {
        this.heSL = heSL;
    }

    public int getThamNien() {
        return thamNien;
    }

    public void setThamNien(int thamNien) {
        this.thamNien = thamNien;
    }

    public float getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(float luongCB) {
        this.luongCB = luongCB;
    }
}
