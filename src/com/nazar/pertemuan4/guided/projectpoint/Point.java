/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan4.guided.projectpoint;

/**
 *
 * @author alwi
 */

// Kelas induk
public class Point {
        protected float x, y;
        
        // Konstruktor kelas induk
        public Point(float a, float b) {
            System.out.println("Konstruktor Point dijalankan");
            x = a;
            y = b;
        }
        
        // Method kelas induk
        public void cetakPoint() {
            System.out.println("Point: [" + x + ", " + y + "]");
        }
}
