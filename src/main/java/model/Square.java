package model;

import java.util.Random;

public class Square extends Figure {
    public String draw() {
        return "квадрат";
    }

    public String getColor() {
        return super.getColor();
    }

    public double getArea() {
        double side = getSide();
        return side * side;
    }

    public double getSide() {
        Random random = new Random();
        return random.nextDouble();
    }

    @Override
    public String toString() {
        return "Фигура: " + draw() + "," +
                " площадь: " + getArea() + " кв. ед.," +
                " сторона: " + getSide() +
                " ед., цвет: " + getColor();
    }
}
