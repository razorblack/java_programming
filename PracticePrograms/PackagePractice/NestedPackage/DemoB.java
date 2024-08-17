package PackagePractice.NestedPackage;

import PackagePractice.DemoA;

public class DemoB {
    public static void main(String[] args) {
        System.out.println("This is from package NestedPackage");

        // Object of DemoB class
        DemoB objB = new DemoB();
        objB.display();

        // Object of DemoA class
        DemoA objA = new DemoA();
        objA.display();

    }

    public void display() {
        System.out.print("Inside Display: Hii,");
        System.out.println("This is from class DemoB");
    }
}
