import model.Circle;
import model.Figure;
import model.Square;
import model.Triangle;
import model.Trapezoid;

import java.util.Random;

public class FigureFactory {
    public Figure createFigure(int rand) {
        Random parameter = new Random();
        switch (rand) {
            case 0:
                return new Circle(parameter.nextDouble());
            case 1:
                return new Triangle(parameter.nextDouble());
            case 2:
                return new Square(parameter.nextDouble());
            case 3:
                return new Trapezoid();
        }
        throw new RuntimeException("Figure doesn't exist");
    }
}
