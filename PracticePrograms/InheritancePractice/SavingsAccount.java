package InheritancePractice;

public class SavingsAccount extends BankAccount{
    int transfer;
    public static void main(String[] args) {
        SavingsAccount object = new SavingsAccount();
        object.accountNumber = "345";
        object.balance = 3343;
        System.out.println(object.accountNumber);
        System.out.println(object.balance);
    }
}
