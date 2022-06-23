/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author alwi
 */
public class DemoStream4 {
    public static void main(String[] args) {
        byte data;
        String namaFile = "test.txt";
        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream(namaFile, false);
            //true artinya menambahkan kedalam file, tidak menimpa
            System.out.print("Ketik: ");
            data = (byte) System.in.read();
            while (data != (byte) '\n') {
                fout.write(data);
                data = (byte) System.in.read();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File " + namaFile + " tidak "
                    + "dapat dicreate");
        } catch (IOException e) {
            System.out.println("Terjadi exception");
        } finally {
            if (fout != null) {
                try {
                    fout.close();
                } catch (IOException e) {
                    System.out.println("Terjadi Exception");
                }
            }
        }
    }
}
