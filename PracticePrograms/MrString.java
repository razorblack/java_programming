import java.util.Scanner;
import java.util.Arrays;

public class MrString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int resultNumber = 0;
        int n = scanner.nextInt();
        int[] arr = new int[n];
        String[] stringArr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            stringArr[i] = numberToWords(arr[i]);
        }
        int totalNumberOfVowels = 0;
        for (int i = 0; i < n; i++) {
            totalNumberOfVowels += vowelCount(stringArr[i]);
        }
        Arrays.sort(arr);
        arr = removeDuplicates(arr);
        n = arr.length;
        int pairSum;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                pairSum = arr[i] + arr[j];
                if (pairSum == totalNumberOfVowels) {
                    resultNumber++;
                }
            }
        }
        if (resultNumber <= 100) {
            System.out.println(numberToWords(resultNumber));
        } else {
            System.out.println("\"greater 100\"");
        }
    }

    public static int vowelCount(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static String numberToWords(int n) {
        String textOfNumber;
        final String[] unitArray = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        final String[] unitArray2 = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
                "seventeen", "eighteen", "nineteen"};
        final String[] tensArray = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy",
                "eighty", "ninety"};
        if (n < 10) {
            textOfNumber = unitArray[n];
        } else if (n <= 19) {
            textOfNumber = unitArray2[n % 10];
        } else if (n <= 99) {
            if (n % 10 == 0) {
                textOfNumber = tensArray[n / 10];
            } else {
                textOfNumber = tensArray[n / 10] + " " + unitArray[n % 10];
            }

        } else {
            textOfNumber = "hundred";
        }
        return textOfNumber;

    }

    public static int[] removeDuplicates(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] == arr[j]) {
                    int temp = j; // Storing start index of shifting
                    for (int k = j + 1; k < len; k++) {
                        arr[temp] = arr[k];
                        temp++;
                    }
                    len--; //For ignoring last element
                    j--;
                }
            }
        }
        int[] shortedArray = new int[len];
        if (len >= 0) System.arraycopy(arr, 0, shortedArray, 0, len);
        return shortedArray;
    }

}
