/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan8;

/**
 *
 * @author alwi
 */
public class CobaThrow {
    public static void main(String[] args) {
        try {
            methodLain();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Penanganan exception dalam method main()");
        }
    }
    
    public static void methodLain() {
        try {
            throw new ArrayIndexOutOfBoundsException(1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Pengangan exception dalam method methodLain()");
            throw e;
        }
    }
}
