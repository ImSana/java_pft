package ru.stqa.pfr.sandbox;

/**
 * Created by Sana on 06.03.2019.
 */
public class Square {
    public double l;

    public Square(double l)
    {
        this.l = l;
    }
    public  double area() {
        return this.l * this.l;
    }
}