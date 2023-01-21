public class Main {
    public static void main(String[] args) {
    Circle circle = new Circle();
    circle.radius = 5;
    circle.color = "Зелёный";
    circle.size = 10;
        System.out.println("Круг");
        System.out.println("Площадь круга: " + circle.calculateAreaCircle(circle.radius));
        System.out.println("Периметр круга: " + circle.calculatePerimeterCircle(circle.radius));

    Triangle triangle = new Triangle();
    triangle.firstSide = 2;
    triangle.secondSide = 2;
    triangle.thirdSide = 2;
        System.out.println("Треугольник");
        System.out.println("Периметр треугольника: "+ triangle.calculatePerimeterTriangle(2,2,2));
        System.out.println("Площадь треугольника: " + triangle.calculateAreaRectangle(2,2,2));

    Square square = new Square();
    square.squareSide = 5;
        System.out.println("Квадрат");
        System.out.println("Периметр квадрата: " + square.calculatePerimeterSquare(square.squareSide));
        System.out.println("Площадь квадрата: " + square.calculateAreaSquare(square.squareSide));
    }
}



            









