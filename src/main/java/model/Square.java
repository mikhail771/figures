package model;

public class Square extends Figure {
    public double side;

    public Square(double side) {
        this.side = side;
    }

    public String draw() {
        return "Фигура: квадрат," +
                " площадь: " + getArea() + " кв. ед.," +
                " сторона: " + side +
                " ед., цвет: " + getColor();
    }

    public Colors getColor() {
        return super.getColor();
    }

    public double getArea() {
        return side * side;
    }
}
