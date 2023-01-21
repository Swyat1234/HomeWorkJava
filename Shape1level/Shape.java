public class Shape {
    protected int size;
    String color;


    protected double calculateAreaCircle(int radius){
        double areaCircle = Math.PI * (radius * radius);
        return areaCircle;
    }

    protected double calculatePerimeterCircle(int radius){
        double perimeterCircle = ((2*Math.PI) * radius);
        return perimeterCircle;
    }

    protected int calculatePerimeterTriangle(int a, int b , int c){
        int perimeterTriangle = a + b + c;
        return perimeterTriangle;
    }

    protected double calculateAreaRectangle(int a, int b , int c){
        double halfPerimeter = (a + b + c) / 2;
        double areaRectangle = Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
        return areaRectangle;
    }

    protected int calculatePerimeterSquare(int side){
        int perimeterSquare = side * 4;
        return perimeterSquare;
    }

    protected int calculateAreaSquare(int side){
        int areaSquare = side * side;
        return areaSquare;
    }
}
