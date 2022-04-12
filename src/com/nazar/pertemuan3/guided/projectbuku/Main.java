/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan3.guided.projectbuku;

import java.util.Scanner;

/**
 *
 * @author alwi
 */
public class Main {
    public static void main(String[] args) {
        Scanner stringInput = new Scanner(System.in);
        Scanner integerInput = new Scanner(System.in);
        
        Buku novel, fiksi;
        novel = new Buku();
        fiksi = new Buku();
        
        System.out.println("Masukkan Judul Buku: ");
        novel.setJudul(stringInput.nextLine());
        
        System.out.println("Masukan Pengarang: ");
        novel.setPengarang(stringInput.nextLine());
        novel.setInfo(0.2f, 45000);
        
        System.out.println("Masukkan Jumlah Halaman: ");
        novel.setJmlhHalaman(integerInput.nextInt());
        novel.cetak();
        
        System.out.println();
        System.out.println("Masukkan Judul Buku: ");
        fiksi.setJudul(stringInput.nextLine());
        
        System.out.println("Masukan Pengarang: ");
        fiksi.setPengarang(stringInput.nextLine());
        fiksi.setInfo(79000);
        
        System.out.println("Masukkan Jumlah Halaman: ");
        fiksi.setJmlhHalaman(integerInput.nextInt());
        fiksi.cetak();
    }
}
