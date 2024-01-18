/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de4;

/**
 *
 * @author trong
 */
public class Word {
    private String en , vi;
    private int id;

    public Word() {
    }

    public Word(int id, String en, String vi) {
        this.id = id;
        this.en = en;
        this.vi = vi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getVi() {
        return vi;
    }

    public void setVi(String vi) {
        this.vi = vi;
    }

    @Override
    public String toString() {
        return "Word{" + "id=" + id + ", en=" + en + ", vi=" + vi + '}';
    }
    
    
}
