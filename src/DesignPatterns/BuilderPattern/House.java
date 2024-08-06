package DesignPatterns.BuilderPattern;

public class House {

    private String foundation;
    private String structure;
    private String roof;
    private String interior;

    private House(HouseBuilder houseBuilder) {
        this.foundation = houseBuilder.foundation;
        this.structure = houseBuilder.structure;
        this.roof = houseBuilder.roof;
        this.interior = houseBuilder.interior;
    }

    public void getFoundation() {
        System.out.println("Foundation: " + foundation);
    }

    public void getStructure() {
        System.out.println("Structure: " + structure);
    }

    public void getRoof() {
        System.out.println("Roof: " + roof);
    }

    public void getInterior() {
        System.out.println("Interior: " + interior);
    }

    public static class HouseBuilder {
        private String foundation;
        private String structure;
        private String roof;
        private String interior;

        public HouseBuilder setFoundation(String foundation) {
            this.foundation = foundation;
            return this;
        }

        public HouseBuilder setStructure(String structure) {
            this.structure = structure;
            return this;
        }

        public HouseBuilder setRoof(String roof) {
            this.roof = roof;
            return this;
        }

        public HouseBuilder setInterior(String interior) {
            this.interior = interior;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}
