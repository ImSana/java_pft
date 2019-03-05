package ru.stqa.pfr.sandbox;
public class MyFirstProgram {

    public static void main(String[] args) {
        hello("Sasha");
        hello("Vasiya");
        hello("Masha");

        double l = 5;
        System.out.println("Площадь квадрата со стороной " + l + "=" + area(l));

        double a = 4;
        double b = 7;
        System.out.println("Площадь Прямоугольника со стороной " + a + " и " + b + "=" + area(a,b));
    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }
    public static double area(double len) {
        return len * len;
    }
    public static double area(double a, double b) {
        return a * b;
    }
}
