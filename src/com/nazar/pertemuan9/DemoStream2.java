/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan9;

import java.io.IOException;

/**
 *
 * @author alwi
 */
public class DemoStream2 {
    public static void main(String[] args) {
        byte[] data = new byte[10];
        int panjang = 0;
        System.out.print("Masukan data: ");
        try {
            panjang = System.in.read(data);
            System.out.print("Yang anda ketik: ");
            System.out.write(data);
            System.out.println("Panjang karakter: " + panjang);
            System.out.print("Index ke-0 sebanyak 4: ");
            System.out.write(data, 0, 4);
        } catch (IOException e) {
            System.out.println("Terjadi exception");
        }
    }
}
