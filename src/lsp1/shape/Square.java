package lsp1.shape;

public class Square implements Quadrilateral {
    private double side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (int) Math.pow(side, 2);
    }

    @Override
    public double getSideA() {
        return side;
    }

    @Override
    public double getSideB() {
        return side;
    }
}
