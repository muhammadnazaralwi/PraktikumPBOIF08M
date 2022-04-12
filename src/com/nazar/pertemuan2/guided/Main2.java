/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan2.guided;

/**
 *
 * @author alwi
 */
public class Main2 {
    public static void main(String[] args) {
        Buku2 buku1, buku2;
        
        buku1 = new Buku2("Siaga Merah", 
                "Alistair Maclean");
        buku2 = new Buku2();
        
        buku1.cetakKeLayar();
        buku2.cetakKeLayar();
    }
}
