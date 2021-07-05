package InheritancePractice;

import java.util.Date;

public class COD extends BankAccount{
    Date expiry;

    public static void main(String[] args) {
        COD object = new COD();
        object.accountNumber = "333";
        object.balance = 345;
        System.out.println(object.accountNumber);
        System.out.println(object.balance);
    }
}
