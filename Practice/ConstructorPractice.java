public class ConstructorPractice {
    int integer;
    String string;


    ConstructorPractice() {
        integer = 0;
        string = null;
    }

    public static void main(String[] args) {
        ConstructorPractice object = new ConstructorPractice();
        System.out.println(object.integer);
        System.out.println(object.string);
    }
}
