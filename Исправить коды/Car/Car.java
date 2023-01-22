package Car;

public abstract class Car {

    abstract void accelerate();

}

abstract class ElectricCar extends Car {

    private int batteryCharge;

}

abstract class PetrolCar extends Car {

    private double petrolTankCapacity;

}
