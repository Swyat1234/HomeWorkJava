import java.util.Random;
import java.util.Scanner;

public class ShapeGenerator extends Shape3D{
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    public void draw() {
    }

    public void generate() {
        int choice;
        choice = random.nextInt(6);
        if (choice == 0) {
            Circle circle = new Circle();
            circle.draw();
        } else if (choice == 1) {
            Square square = new Square();
            square.draw();
        } else if (choice == 2) {
            Triangle triangle = new Triangle();
            triangle.draw();
        } else if (choice == 3) {
            Rectangle rectangle = new Rectangle();
            rectangle.draw();
        } else if (choice == 4) {
            Cube cube = new Cube();
            cube.draw();
        } else if (choice == 5) {
            Cylinder cylinder = new Cylinder();
            cylinder.draw();
        }
    }
}

