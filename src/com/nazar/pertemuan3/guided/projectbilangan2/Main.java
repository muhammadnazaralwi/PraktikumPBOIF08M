/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan3.guided.projectbilangan2;

/**
 *
 * @author alwi
 */
public class Main {
    public static void main(String[] args) {
        int x, y;
        Bilangan bil = new Bilangan(10, 20);
        
        x = 15;
        y = 30;
        
        System.out.println("Nilai x, y sebelum pased by value");
        System.out.println("Nilai x : " + x);
        System.out.println("Nilai y : " + y);
        
        bil.operasi_pass_by_value(x, y);
        
        System.out.println("Nilai x, y sesudah pased by value");
        System.out.println("Nilai x : " + x);
        System.out.println("Nilai y : " + y);
        
        System.out.println("Nilai bil.a dan bil.b sebelum passed by reference");
        bil.tampil();
        
        bil.operasi_pass_by_reference(bil);
        
        System.out.println("Nilai bil.a dan bil.b setelah passed by reference");
        bil.tampil();
    }
}
