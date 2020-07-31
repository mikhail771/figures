package model;

import java.util.Random;

public class Trapezoid extends Figure {
    public String draw() {
        return "Фигура: трапеция," +
                " площадь: " + getArea() + " кв. ед.," +
                " ед., цвет: " + getColor();
    }

    public Colors getColor() {
        return super.getColor();
    }

    public double getArea() {
        Random random = new Random();
        return (random.nextDouble() + random.nextDouble()) / 2 * random.nextDouble();
    }
}
