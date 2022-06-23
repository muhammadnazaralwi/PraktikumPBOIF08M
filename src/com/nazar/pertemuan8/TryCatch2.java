/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan8;

/**
 *
 * @author alwi
 */
public class TryCatch2 {
    public static void main(String[] args) {
        try {
            int x = args.length; // 0
            //java CommandLine ini merupakan nilai arguments
            int y = 100/x;
            int[] arr = {10, 11};
            y = arr[x];
            System.out.println("Tidak terjadi exception");
        } catch (ArithmeticException e) {
            System.out.println("Terjadi exception karena pembagian dengan nol");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi exception karena indeks "
                    + "di luar kapasitas array");
        }
    }
}
