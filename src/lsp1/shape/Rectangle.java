package lsp1.shape;

public class Rectangle implements Quadrilateral {
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB) {
        this.setSideA(sideA);
        this.setSideB(sideB);
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public double getArea() {
        return sideA * sideB;
    }
}
