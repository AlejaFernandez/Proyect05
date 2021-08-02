/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.misiontic.project05_uml;

/**
 *
 * @author aleja
 */
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4.5);
        double area = circle.getRadius();
        System.out.println(area);
    }
}
