public class Rectangle extends ShapeGenerator{
    @Override
    public void draw() {
        System.out.println("Введите стороны прямоугольника");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int areaRectangle = a * b;
        int perimeterRectangle = (a + b) * 2;
        System.out.println("Рисую прямоугольник с площадью " + areaRectangle + " и периметром " + perimeterRectangle);
    }
}
