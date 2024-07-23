class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}

class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }
}

public class Main {

    public static void main(String[] args) {
        Rectangle rec = new Rectangle(4, 5);
        Square sq = new Square(4);

        System.out.println(rec.getArea());
        System.out.println(rec.getPerimeter());
        System.out.println(sq.getArea());
        System.out.println(sq.getPerimeter());
    }
}
