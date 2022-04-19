/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan4.guided.projectpoint;

/**
 *
 * @author alwi
 */

// Kelas anak
public class Circle extends Point {
    private float radius;
    
    // Konstruktor kelas anak memanggil konstruktor kelas induk
    public Circle(float r, float a, float b) {
        super(a, b);
        radius = r;
        System.out.println("Konstruktor Circle dijalankan");
    }
    
    // Method yang memanggil method induk dari kelas induknya
    // dengan menggunakan  keyword super
    @Override
    public void cetakPoint() {
        super.cetakPoint();
        System.out.println("Radius: " + radius);
    }
}
