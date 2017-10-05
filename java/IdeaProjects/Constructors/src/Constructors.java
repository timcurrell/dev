/**
 * Created by Tim on 7/30/2017.
 */
public class Constructors {

    public static void main(String[] args) {

        // Calling the (now customized) constructor to illustrate how the constructor class
        // can be overridden.

        BankAccount megsAccount = new BankAccount();

        BankAccount sophiasAccount = new BankAccount(987654321, 250.00, "Sophia Vicencio",
                "schmoo@uoregon.edu", "503-678-1234");

        System.out.println(sophiasAccount.getAcctNumber());
        System.out.println(sophiasAccount.getAcctBalance());
        System.out.println(sophiasAccount.getCustName());
        System.out.println(sophiasAccount.getCustEmail());
        System.out.println(sophiasAccount.getCustPhone());

        BankAccount mattsAccount = new BankAccount(123456789, 150.00);

        System.out.println(mattsAccount.getAcctNumber());
        System.out.println(mattsAccount.getAcctBalance());
        System.out.println(mattsAccount.getCustName());
        System.out.println(mattsAccount.getCustEmail());
        System.out.println(mattsAccount.getCustPhone());

    }
}
