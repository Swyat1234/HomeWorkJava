public class Square extends ShapeGenerator{
    @Override
    public void draw() {
        System.out.println("Введите сторону квадрата");
        int side = scanner.nextInt();
        int areaSquare = side * side;
        int perimeterSquare = side * 4;
        System.out.println("Рисую квадрат с площадью " + areaSquare + " и периметром " + perimeterSquare);
    }
}
