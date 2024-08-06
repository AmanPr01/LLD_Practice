package DesignPatterns.ProtypePattern;

import DesignPatterns.ProtypePattern.DeepCopy.Address;
import DesignPatterns.ProtypePattern.DeepCopy.Employee;
import DesignPatterns.ProtypePattern.ShallowCopy.ShallowAddress;
import DesignPatterns.ProtypePattern.ShallowCopy.ShallowEmployee;

public class Client {
    public static void main(String[] args) {
        Circle originalCircle = new Circle(5, "Red");
        Circle copyCircle = originalCircle.clone();

        System.out.println("Original Circle: " + originalCircle);
        System.out.println("Copy Circle: " + copyCircle);
    }
}
