import model.Figure;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        FigureFactory figureFactory = new FigureFactory();
        Figure[] figures = new Figure[random.nextInt(10)];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureFactory.createFigure(random.nextInt(4));
        }
        for (Figure figure :
                figures) {
            System.out.println(figure);
        }
    }
}
