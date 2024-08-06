package DesignPatterns.ProtypePattern.DeepCopy;

public class Client {
    public static void main(String[] args) {
        Address address = new Address("South Delhi", "Delhi");
        Employee originalEmployee = new Employee("Aman", address);
        Employee copyEmployee = originalEmployee.clone();

        System.out.println("Original Employee: " + originalEmployee);
        System.out.println("Copy Employee: " + copyEmployee);
        System.out.println();

//        copyEmployee.address = new Address("North Delhi", "Delhi");
        copyEmployee.address.street = "North Delhi";
        copyEmployee.address.city = "Delhi";
        System.out.println("Original Employee after modification: " + originalEmployee);
        System.out.println("Copy Employee after modification: " + copyEmployee);
    }
}
