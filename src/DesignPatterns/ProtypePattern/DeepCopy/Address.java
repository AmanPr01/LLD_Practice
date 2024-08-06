package DesignPatterns.ProtypePattern.DeepCopy;

public class Address {
    public String street;
    public String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public Address(Address address) {
        this.street = address.street;
        this.city = address.city;
    }

    @Override
    public String toString() {
        return "Address: [street = " + street + ", city = " + city + "]";
    }
}
