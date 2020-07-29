package model;

import java.util.Random;

public class Circle extends Figure {
    public String draw() {
        return "круг";
    }

    public String getColor() {
        return super.getColor();
    }

    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    public double getRadius() {
        Random random = new Random();
        return random.nextDouble();
    }

    @Override
    public String toString() {
        return "Фигура: " + draw() + "," +
                " площадь: " + getArea() + " кв. ед.," +
                " радиус: " + getRadius() +
                " ед., цвет: " + getColor();
    }
}
