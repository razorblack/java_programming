package InheritancePractice;

public class CheckingAccount extends BankAccount{
    double limit;

    public static void main(String[] args) {
        CheckingAccount object = new CheckingAccount();
        object.accountNumber = "222";
        object.balance = 343;
        System.out.println(object.accountNumber);
        System.out.println(object.balance);
    }
}
