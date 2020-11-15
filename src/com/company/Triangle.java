package com.company;

public class Triangle {
    private double side1;
    public double side2;
    public double side3;


    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }

    public  void geroneSquare() {
        double p = (side1 + side2 + side3) / 2;
        System.out.println(Math.sqrt(p * (p - side1) * (p - side2) * (p - side3)));
    }

}
