package ru.stqa.pfr.sandbox;

/**
 * Created by Sana on 30.03.2019.
 */
public class Equation {

  private double a;
  private double b;
  private double c;

  private int n;

  public Equation(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;

    double d = b * b - 4 * a * c;

    if (a == 0) {
      if (b == 0) {
        if (c == 0) {
          n = -1;
        } else {
          n = 0;
        }
      } else {
        n = 1;
      }
    } else {
      if (d > 0) {
        n = 2;
      } else if (d == 0) {
        n = 1;
      } else {
        n = 0;
      }
    }
  }
  public int rootNumber() {
    return n;
  }
public static void main(String[] args) {
    String s1 = "firefox 2.0";
    String s2 = "firefox" + Math.sqrt(4.0);
System.out.println(s1 == s2);
System.out.println(s1.equals(s2));
  }
}

