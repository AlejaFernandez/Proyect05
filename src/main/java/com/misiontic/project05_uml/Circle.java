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
public class Circle extends Polygon {
    private double area;
    private double perimeter;
    private float radius;
    private final double PI = 3.1416;
    
     Circle(float radius){
        setRadius(radius);
        calculateArea();
    }
    Circle(double area){
        setArea(area);
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
    

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
    
     private void calculateArea(){
        this.area = this.PI*this.radius*this.radius;
    }
    private void calculateRadius(){
        this.radius = (float)Math.sqrt(this.area/this.PI);

    }
}
