package com.company;

public class Rectangle {
    private double base = 1.0;
    private double height = 1.0;
    public void setBase(double base){
        this.base = base;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getBase(){
        return this.base;
    }
    public double getHeight(){
        return this.height;
    }
    public Rectangle(double base,double height){
        this.setBase(base);
        this.setHeight(height);
    }
    public double calcularArea(){
        double area = this.base*this.height;
        return area;
    }
    public double calcularPerimetro(){
        double perimetro = this.base*2+this.height*2;
        return perimetro;
    }
}
