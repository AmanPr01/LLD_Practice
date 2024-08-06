package DesignPatterns.ProtypePattern.ShallowCopy;

public class ShallowAddress {
    public String street;
    public String city;

    public ShallowAddress(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public ShallowAddress(ShallowAddress shallowAddress) {
        this.street = shallowAddress.street;
        this.city = shallowAddress.city;
    }

    public String toString() {
        return "Street: " + this.street + ", City: " + this.city;
    }
}
