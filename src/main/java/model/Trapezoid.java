package model;

import java.util.Random;

public class Trapezoid extends Figure {
    public String draw() {
        return "трапеция";
    }

    public String getColor() {
        return super.getColor();
    }

    public double getArea() {
        Random random = new Random();
        return (random.nextDouble() + random.nextDouble()) / 2 * random.nextDouble();
    }

    @Override
    public String toString() {
        return "Фигура: " + draw() +
                ", площадь: " + getArea() + " кв. ед.," +
                " ед., цвет: " + getColor();
    }
}
