/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nazar.pertemuan5.guided.demointerface;

/**
 *
 * @author alwi
 */
public class LocalFeedLoader implements FeedLoader {
    @Override
    public void load() {
        System.out.println("Load from Local");
    }
}
