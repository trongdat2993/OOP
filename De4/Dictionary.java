/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author trong
 */
public class Dictionary {
    private ArrayList<Word> tuDien = new ArrayList<>();

    public Dictionary() {
        tuDien.add(new Word(1, "dog", "cho"));
        tuDien.add(new Word(2, "cat", "meo"));
        tuDien.add(new Word(3, "bird", "chim"));
        tuDien.add(new Word(4, "hotdog", "xuc xich"));
        tuDien.add(new Word(5, "go", "di"));
        tuDien.add(new Word(6, "apple", "tao"));
        tuDien.add(new Word(7, "orange", "cam"));
        tuDien.add(new Word(8, "banana", "chuoi"));
        tuDien.add(new Word(9, "word", "tu"));
        tuDien.add(new Word(10, "hello", "xin chao"));
        tuDien.sort(Comparator.comparing(Word::getEn));
    }
    
    public int timKiem(ArrayList<Word> list, int n, String s){
        int left = 0;
        int right = n - 1;
        while(left <= right){
            int mid = (int)(left + right)/2;
            if(list.get(mid).getEn().compareTo(s) == 0){
                return mid;
            }
            if(list.get(mid).getEn().compareTo(s) < 0){
                left = mid + 1;
            }
            if(list.get(mid).getEn().compareTo(s)> 0){
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) throws IOException {
        Dictionary dic = new Dictionary();
        File file = new File("D:\\books.dat");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        for (Word w : dic.tuDien) {
            bw.write(w.toString());
        }
        int check = dic.timKiem(dic.tuDien, dic.tuDien.size(), "bird");
        Word w = new Word(11, "english", "tieng anh");
        dic.tuDien.add(check, w);
        
    }
}

