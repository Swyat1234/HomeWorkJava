public class Triangle extends ShapeGenerator {
    @Override
    public void draw() {
        System.out.println("Введите стороны треугольника");
        int c = scanner.nextInt();
        int b = scanner.nextInt();
        int a = scanner.nextInt();
        double halfPerimeter = (a + b + c) / 2;
        double areaRectangle = Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
        int perimeterTriangle = a + b + c;
        System.out.println("Рисую треугольник с площадью " + areaRectangle + " и с периметром " + perimeterTriangle);
    }
}
