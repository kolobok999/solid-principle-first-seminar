package lsp1;

import lsp1.shape.Quadrilateral;
import lsp1.shape.Rectangle;
import lsp1.shape.Square;
import lsp1.view.ShapeView;

public class Main {
    public static void main(String[] args) {
        Quadrilateral rectangle = new Rectangle(4,5);
        Quadrilateral square = new Square(5);

        System.out.printf("In a rectangle side A = %f, side B = %f\n", rectangle.getSideA(), rectangle.getSideB());
        ShapeView view = new ShapeView(rectangle);
        view.showArea();

        System.out.printf("In a square side %f\n", square.getSideA());
        view = new ShapeView(square);
        view.showArea();
    }
}
