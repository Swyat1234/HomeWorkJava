public class Cylinder extends ShapeGenerator{
    @Override
    public void draw() {
        System.out.println("Введите высоту и радиус цилиндра");
        int high = scanner.nextInt();
        int radius = scanner.nextInt();
        int perimeterCylinder = 0;
        double areaCylinder = 2 * (Math.PI * radius * high) + 2 * ((Math.PI * radius) * (Math.PI * radius));
        System.out.println("Рисую цилиндр c площадью " + areaCylinder + " и объемом " + getCylinderVolume(high,radius));
        System.out.println("К сожалению периметр не находиться " + perimeterCylinder);
    }

    @Override
    public double getCylinderVolume(double high, double radius) {
        double cylinderVolume = (((Math.PI * radius) * (Math.PI * radius)) * high);
        return cylinderVolume;
    }
}
