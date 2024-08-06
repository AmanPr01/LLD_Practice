package DesignPatterns.ProtypePattern.ShallowCopy;

import DesignPatterns.ProtypePattern.Prototype;

public class ShallowEmployee implements Prototype {

    public String name;
    public ShallowAddress address;

    public ShallowEmployee(String name, ShallowAddress address) {
        this.name = name;
        this.address = address;
    }

    public ShallowEmployee(ShallowEmployee shallowEmployee) {
        this.name = shallowEmployee.name;
        this.address = shallowEmployee.address;  // Shallow copy, shares same Address instance
    }

    @Override
    public ShallowEmployee clone() {
        return new ShallowEmployee(this);
    }



    public String toString() {
        return "Employee [name = " + name + ", address = " + address + "]";
    }
}
