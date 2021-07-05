import java.util.*;

public class Volume {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice 1.Cylinder 2.Cone 3.Sphere");
        int choice = sc.nextInt();
        double vol;
        if (choice == 1) {
            System.out.println("Enter radius");
            double r = sc.nextDouble();
            System.out.println("Enter height");
            double h = sc.nextDouble();
            vol = ((22 / 7) * Math.pow(r, 2) * h);
            System.out.println("Volume of cylinder is " + vol);
        } else if (choice == 2) {
            System.out.println("Enter radius");
            double r = sc.nextDouble();
            System.out.println("Enter height");
            double h = sc.nextDouble();
            vol = (1.0 / 3* 22.0/7 * Math.pow(r, 2) * h);
            System.out.println("Volume of cone is " + vol);
        } else if (choice == 3) {
            System.out.println("Enter radius");
            double r = sc.nextDouble();
            vol = ((4 / 3) * (22 / 7) * Math.pow(r, 3));
            System.out.println("Volume of sphere is " + vol);
        }
    }
}


