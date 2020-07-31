package model;

import java.util.Random;

public abstract class Figure {
    public abstract String draw();

    public abstract double getArea();

    public Colors getColor() {
        Colors[] values = Colors.values();
        Random random = new Random();
        int rand = random.nextInt(5);
        return values[rand];
    }
}
