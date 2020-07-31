package model;

public class Circle extends Figure {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public String draw() {
        return  "Фигура: круг," +
                " площадь: " + getArea() + " кв. ед.," +
                " радиус: " + radius +
                " ед., цвет: " + getColor();
    }

    public Colors getColor() {
        return super.getColor();
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
