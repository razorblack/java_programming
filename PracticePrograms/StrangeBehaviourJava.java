// This class is for some of strange behavior in java
// Which should be known to programmers

public class StrangeBehaviourJava {
    public static void main(String[] args) {
        int temp = 5;
        boolean test = false;

        // Strange 1:

        // Code below will give error
//        if (temp = 5) {
//            System.out.println("Error!!");
//        }
        // But the above code with boolean will run
        if (test = true) {
            System.out.println("This runs!!");
        }
        // Now value of test is changed to true in if statement
        System.out.println(test); // Prints true

        // Strange 2: Insert unicode directly into string double quotes works
        // But inserting character variable in double quotes will print variable name not value
        char c = '\u0000';
        String string = "Hello " + c + " World"; // This works
        String string1 = "Hello " + " \u0000 World"; // This also works
        String string3 = "Hello " + "c World"; // This print Hello c World
        System.out.println(string3);


        // Strange 3:
        // Adding number (decimal or floating) with strings just perform concatenation
        String s = "Hello" + 5;
        System.out.println(s);
    }
}
