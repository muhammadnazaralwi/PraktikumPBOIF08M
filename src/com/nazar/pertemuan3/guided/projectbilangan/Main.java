/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan3.guided.projectbilangan;

/**
 *
 * @author alwi
 */
public class Main {
    public static void main(String[] args) {
        int x, y;
        Bilangan bilangan = new Bilangan(10, 20);
        
        x = 15;
        y = 30;
        
        System.out.println("Nilai x dan y sebelum passed by value");
        System.out.println("Nilai x: " + x);
        System.out.println("Nilai y: " + y);
        bilangan.operasiPassByValue(x, y);
        
        System.out.println("Nilai x dan y setelah passed by value");
        System.out.println("Nilai x: " + x);
        System.out.println("Nilai y: " + y);
        
        System.out.println("Nilai bilangan.a dan bilangan.b sebelum passed by reference");
        bilangan.tampil();
        bilangan.operasiPassByReference(bilangan);
        System.out.println("Nilai bilangan.a dan bilangan.b setelah passed by reference");
        bilangan.tampil();
    }
}
