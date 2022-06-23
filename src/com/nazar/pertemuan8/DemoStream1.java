/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan8;

import java.io.IOException;

/**
 *
 * @author alwi
 */
public class DemoStream1 {
    public static void main(String[] args) {
        byte[] data = new byte[10];
        System.out.print("Masukkan data: ");
        try {
            System.in.read(data);
        } catch (IOException e) {
            System.out.println("Terjadi Exception");
        }
        
        System.out.print("Yang anda ketik: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print((char) data[i]);
            // (char) di atas disebut casting, 
            // yakni untuk mengubah format menjadi char
        }
    }
}
