package model;

import java.util.Random;

public abstract class Figure {
    public abstract String draw();

    public abstract double getArea();

    public String getColor() {
        Random random = new Random();
        int rand = random.nextInt(5);
        switch (rand) {
            case 0:
                return "красный";
            case 1:
                return "синий";
            case 2:
                return "желтый";
            case 3:
                return "черный";
            case 4:
                return "белый";
            default:
                return "прозрачный";
        }
    }
}
