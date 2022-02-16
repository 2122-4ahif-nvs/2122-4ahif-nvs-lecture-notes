package at.htl.unittesting.entity;

public class Lkw extends Vehicle {
    public Lkw(String brand, String model) {

    }

    @Override
    public String tanken() {
        return "Ich tanke Diesel";
    }
}
