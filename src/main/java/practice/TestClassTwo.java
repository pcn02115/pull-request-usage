package practice;

class Square {
    private int horizontal;
    private int vertical;
    private int area;
    Square(int horizontal, int vertical) {
        this.horizontal = horizontal;
        this.vertical = vertical;
        area = this.horizontal * this.vertical;
    }
    void SquareHV() {
        System.out.println("가로: " + this.horizontal);
        System.out.println("세로: " + this.vertical);
    }
    void SquareArea() {
        System.out.println("넓이: " + area);
    }
    int getArea() {
        return area;
    }
}
class Hexahedron {
    private int height;
    private int area;
    private Square square;
    Hexahedron(int horizontal, int vertical, int height) {
        square = new Square(horizontal, vertical);
        this.height = height;
        this.area = this.height * square.getArea();
    }
    void HexArea() {
        square.SquareHV();
        System.out.println("높이: " + this.height);
        System.out.println("넓이: " + this.area);
    }
}
class Figure {
    private Hexahedron hexahedron;
    Figure (int horizontal, int vertical, int height) {
        hexahedron = new Hexahedron(horizontal, vertical, height);
    }
    void info() {
        hexahedron.HexArea();
    }

}

public class TestClassTwo {
    public static void main(String[] args) {
        Figure figure = new Figure(3, 5, 9);
        figure.info();
    }
}
