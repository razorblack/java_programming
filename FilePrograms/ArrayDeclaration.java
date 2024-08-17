public class ArrayDeclaration {
    public static void main(String[] args) {
        // Declaration style:
        // datatype[] name; datatype []name; datatype name[];
        int[] arr = new int[2];
        arr[0] = 1;
        arr[1] = 2;
        display(arr);

        int[] arr1 = new int[]{1,2,3,4};
        display(arr1);

        int[] arr2 = {1,2,3,4};
        display(arr2);

        int[] arr3 = new int[3];
        arr3 = new int[]{1, 2, 3};
        display(arr3);
    }
    public static void display(int[] arr) {

        System.out.println(arr); //Address printing
        for (int a : arr) {
            System.out.println(a);
        }
    }
}
