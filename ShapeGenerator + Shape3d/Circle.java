public class Circle extends ShapeGenerator {

    @Override
    public void draw() {
        System.out.println("Введите радиус круга");
        double radius =scanner.nextDouble();
        double areaCircle = Math.PI * (radius * radius);
        double perimeterCircle = ((2*Math.PI) * radius);
        System.out.println("Рисую круг c площадью :" + areaCircle + " и периметром " + perimeterCircle);
    }


}

