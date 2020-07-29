import model.*;

public class FigureFactory {
    public Figure createFigure(int rand) {
        switch (rand) {
            case 0:
                return new Circle();
            case 1:
                return new Tringle();
            case 2:
                return new Square();
            case 3:
                return new Trapezoid();
        }
        return null;
    }
}
