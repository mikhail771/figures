package model;

import java.util.Random;

public class Triangle extends Figure {
    public double side;

    public Triangle(double side) {
        this.side = side;
    }
    public String draw() {
        return "Фигура: треугольник," +
                " площадь: " + getArea() + " кв. ед.," +
                " гипотенуза: " + side +
                " ед., цвет: " + getColor();
    }

    public Colors getColor() {
        return super.getColor();
    }

    public double getArea() {
        Random random = new Random();
        return random.nextDouble() * random.nextDouble() / 2;
    }
}
