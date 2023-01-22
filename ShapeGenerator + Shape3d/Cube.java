public class Cube extends  ShapeGenerator{
    @Override
    public void draw() {
        System.out.println("Введите сторону куба");
        int a =scanner.nextInt();
        int areaCube = 6 * (a * a);
        int perimeterCube = a * 12;
        System.out.println("Рисую Куб c площадью " + areaCube + " и периметром " + perimeterCube + " и объёмом " + getCubeVolume(a));
    }

    @Override
    public int getCubeVolume(int a) {
        int cubeVolume = a * a * a ;
        return cubeVolume;
    }
}
