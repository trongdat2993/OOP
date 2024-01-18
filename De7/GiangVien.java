/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de7;

/**
 *
 * @author trong
 */
public class GiangVien extends NhanVien{
    private String maGV, diaChi, gioiTinh, khoa;

    public GiangVien() {
    }

    public GiangVien(String maGV, String diaChi, String gioiTinh, String khoa, String id, String hoTen) {
        super(id, hoTen);
        this.maGV = maGV;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.khoa = khoa;
    }

    

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    @Override
    public String toString() {
        return super.toString() + "GiangVien{" + "maGV=" + maGV + ", diaChi=" + diaChi + ", gioiTinh=" + gioiTinh + ", khoa=" + khoa + '}';
    }
    
    
    
}
