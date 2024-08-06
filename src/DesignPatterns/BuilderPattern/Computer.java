package DesignPatterns.BuilderPattern;

public class Computer {

    private final String CPU;
    private final String RAM;
    private final boolean isGraphicsCardEnabled;
    private final boolean isBluetoothEnabled;

    private Computer(ComputerBuilder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    public void getCPU() {
        System.out.println("CPU: " + CPU);
    }

    public void getRAM() {
        System.out.println("RAM: " + RAM);
    }

    public void isGraphicsCardEnabled() {
        System.out.println("isGraphicsCardEnabled: " + isGraphicsCardEnabled);
    }

    public void isBluetoothEnabled() {
        System.out.println("isBluetoothEnabled: " + isBluetoothEnabled);
    }

    public static class ComputerBuilder {

        private String CPU;
        private String RAM;
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public ComputerBuilder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public ComputerBuilder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}


/*
Here we will be writing getter outside builder class so that we can access this later.
 */