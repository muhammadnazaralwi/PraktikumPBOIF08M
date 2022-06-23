/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan9;

import java.io.*;

/**
 *
 * @author alwi
 */
public class BarangSer implements Serializable {
    private String nama;
    private int jumlah;
    
    public BarangSer(String nm, int jml) {
        nama = nm;
        jumlah = jml;
    }
    
    public void tampil() {
        System.out.println("nama barang: " + nama);
        System.out.println("jumlah barang: " + jumlah);
    }
    
    public void simpanObject(BarangSer ob) {
        try {
            FileOutputStream fos = new FileOutputStream("dataBrg.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(ob);
            oos.flush();
        } catch (IOException ioe) {
            System.err.println("error " + ioe);
        }
    }
    
    public void bacaObject(BarangSer obb) {
        try {
            FileInputStream fis = new FileInputStream("dataBrg.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            while ((obb = (BarangSer) ois.readObject()) != null)
            obb.tampil();
        } catch (IOException | ClassNotFoundException ioe) {
            System.exit(1);
        }
    }
    
    public static void main(String[] args) {
        BarangSer a1 = new BarangSer("Baju", 5);
        a1.simpanObject(a1);
        a1.bacaObject(a1);
    }
}
