package DesignPatterns.ProtypePattern.ShallowCopy;

public class Client {
    public static void main(String[] args) {
        ShallowAddress shallowAddress = new ShallowAddress("Karol Bagh", "Delhi");
        ShallowEmployee originalShallowEmployee = new ShallowEmployee("Aman", shallowAddress);
        ShallowEmployee copyShallowEmployee = originalShallowEmployee.clone();

        System.out.println("Original Shallow Employee: " + originalShallowEmployee);
        System.out.println("Copy Shallow Employee: " + copyShallowEmployee);
        System.out.println();

        copyShallowEmployee.address.street = "Janakpuri";
        copyShallowEmployee.address.city = "Delhi";
        System.out.println("Original Shallow Employee after modification: " + originalShallowEmployee);
        System.out.println("Copy Shallow Employee after modification: " + copyShallowEmployee);
    }
}
