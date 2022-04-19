/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan4.guided.petanikode;

/**
 *
 * @author alwi
 */
public class Burung extends Enemy {
    public void walk() {
        System.out.println(super.name + " berjalan...");
    }
    
    public void lompat() {
        System.out.println(super.name + " melompoat...");
    }
    
    public void fly() {
        System.out.println(super.name + " terbang...");
    }
}
