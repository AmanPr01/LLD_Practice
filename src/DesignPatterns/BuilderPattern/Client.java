package DesignPatterns.BuilderPattern;

public class Client {
    public static void main(String[] args) {

//        Car car = Car.getBuilder().setEngine("V8").setWheels(4).setColor("Red").build();

        Computer computer = new Computer.ComputerBuilder().setCPU("Intel").setRAM("8 GB").setGraphicsCardEnabled(true).setBluetoothEnabled(true).build();
        computer.getCPU();
        computer.getRAM();
        computer.isGraphicsCardEnabled();
        computer.isBluetoothEnabled();

        // Bike bike = new Bike("V4", 2);

        Computer computer1 = new Computer.ComputerBuilder().setCPU("M4").setGraphicsCardEnabled(false).build();
        computer1.getCPU();
        computer1.getRAM();
        computer1.isGraphicsCardEnabled();
        computer1.isBluetoothEnabled();

        House house = new House.HouseBuilder()
                .setFoundation("Concrete")
                .setStructure("Wood and Brick")
                .setRoof("Shingles")
                .setInterior("Modern")
                .build();

        house.getFoundation();
        house.getStructure();
        house.getRoof();
        house.getInterior();

    }
}

/*
Bike object is why we need builder, because to create bike class,
we have to give all attributes, if some attributes are missing
it will show error.
This problem is not with Builder class.
You can set sny number of attributes you want.
 */