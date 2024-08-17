import java.math.BigInteger;
import java.util.Scanner;

public class CRC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        String generatorPolynomial = scanner.nextLine(); // Generator polynomial

        // Enter choice
        System.out.println("Enter 1: Encoding and 2: Decoding");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Enter binary to be encoded");
                String strToEncode = scanner.nextLine();
                encoding(strToEncode, generatorPolynomial);
                break;

            case 2:
                System.out.println("Enter binary to be decoded");
                String strToDecode = scanner.nextLine();
                decoding(strToDecode, generatorPolynomial);
                break;

            default:
                System.out.println("Enter valid choice");
                break;
        }


    }

    private static void decoding(String strToDecode, String generatorPolynomial) {
        int lenGP = generatorPolynomial.length();
        int lenEncodedStr = strToDecode.length();

        String decodedBinary = strToDecode.substring(0,lenEncodedStr - lenGP + 1);

        System.out.println(decodedBinary);
    }

    private static void encoding(String strToEncode, String generatorPolynomial) {
        String encodedString = strToEncode; // Final encoded string
        int lenGP = generatorPolynomial.length(); // Length generator polynomial
        // Appending zeros
        for (int i = 0; i < lenGP - 1; i++) {
            strToEncode += "0";
        }

        // Division process
        BigInteger divisor = new BigInteger(generatorPolynomial, 2);
        BigInteger dividend = new BigInteger(strToEncode, 2);
        BigInteger result = dividend.remainder(divisor);


        // TODO: Add remainder into encodedString then print
        System.out.println(encodedString + result.toString(2));


    }
}
