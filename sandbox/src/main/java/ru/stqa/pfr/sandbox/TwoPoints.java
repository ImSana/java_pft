package ru.stqa.pfr.sandbox;

/**
 * Created by Sana on 10.03.2019.
 */
public class TwoPoints {
  public static void main(String args[]) {
    Point p1 = new Point(5, 6);
    Point p2 = new Point(8, 6);


    System.out.println("x = " + p1.x + " y = " + p1.y);
    System.out.println("x = " + p2.x + " y = " + p2.y);
    System.out.println("Расстояние между двумя точками = " + p1.distance(p2));
  }
}
