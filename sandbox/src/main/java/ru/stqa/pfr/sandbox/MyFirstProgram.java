package ru.stqa.pfr.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("Sasha");
        hello("Vasiya");
        hello("Masha");

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + "=" + s.area());

        Rectangle r = new Rectangle(4, 7);

        System.out.println("Площадь Прямоугольника со стороной " + r.a + " и " + r.b + "=" + r.area());


    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }

}
