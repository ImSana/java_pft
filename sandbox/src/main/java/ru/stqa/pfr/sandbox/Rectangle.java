package ru.stqa.pfr.sandbox;

/**
 * Created by Sana on 06.03.2019.
 */
public class Rectangle {
    public double a;
    public double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public  double area() {
        return this.a * this.b;
    }
}
