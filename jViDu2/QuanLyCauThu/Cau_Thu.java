/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author trong
 */
public class Cau_Thu {
    private String id;
    private String hoTen;
    private int namSinh;
    private String viTri;

    public Cau_Thu() {
    }

    public Cau_Thu(String id, String hoTen, int namSinh, String viTri) {
        this.id = id;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.viTri = viTri;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    } 
}

