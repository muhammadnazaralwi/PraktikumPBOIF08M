/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan3.guided.projectbilangan;

/**
 *
 * @author alwi
 */
public class Bilangan {
    private int a;
    private int b;
    
    public Bilangan(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public void tampil() {
        System.out.println("Nilai bil.a : " + a);
        System.out.println("Nilai bil.b : " + b);
    }
    
    public void operasiPassByValue(int x, int y) {
        x = x * 10;
        y = y + 15;
        
        System.out.println("Nilai x (dari Bilangan): " + x);
        System.out.println("Nilai y (dari Bilangan): " + y);
    }
    
    public void operasiPassByReference(Bilangan bilangan) {
        bilangan.a = bilangan.a * 10;
        bilangan.b = bilangan.b + 15;
    }
}
