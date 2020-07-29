package model;

import java.util.Random;

public class Tringle extends Figure {
    public String draw() {
        return "треугольник";
    }

    public String getColor() {
        return super.getColor();
    }

    public double getArea() {
        Random random = new Random();
        return random.nextDouble() * random.nextDouble() / 2;
    }

    public double getHypotenuse() {
        Random random = new Random();
        return Math.sqrt(Math.pow(random.nextDouble(), 2) + Math.pow(random.nextDouble(), 2));
    }

    @Override
    public String toString() {
        return "Фигура: " + draw() + "," +
                " площадь: " + getArea() + " кв. ед.," +
                " гипотенуза: " + getHypotenuse() +
                " ед., цвет: " + getColor();
    }
}
