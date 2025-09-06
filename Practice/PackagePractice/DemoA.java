package PackagePractice;

import PackagePractice.NestedPackage.DemoB;

public class DemoA {
    public static void main(String[] args) {
        System.out.println("This is form package PackagePractice");

        // Calling through Object of DemoA class
        DemoA objA = new DemoA();
        objA.display();

        // Calling through Object of DemoB class
        DemoB objB = new DemoB();
        objB.display();

        // Calling through import of DemoB
        DemoB.main(new String[]{""});

    }
    public void display() {
        System.out.print("Inside Display: Hii, ");
        System.out.println("This is form class DemoA");
    }

}
