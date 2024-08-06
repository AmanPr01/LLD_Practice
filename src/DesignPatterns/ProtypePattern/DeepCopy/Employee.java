package DesignPatterns.ProtypePattern.DeepCopy;

import DesignPatterns.ProtypePattern.Prototype;

public class Employee implements Prototype {

    public String name;
    public Address address;

    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Employee(Employee employee) {
        this.name = employee.name;
        this.address = new Address(employee.address);  // Here we are creating a new Address instance
    }

    @Override
    public Employee clone() {
        return new Employee(this);
    }

    public String toString() {
        return "Employee [name = " + name + ", address = " + address + "]";
    }
}
