/**
 * Created by Tim on 7/30/2017.
 */
public class ClassesChallenge {

    public static void main(String[] args) {

        BankAccount timsAccount = new BankAccount();

        timsAccount.setAcctBalance(100.00);
        timsAccount.setAcctNumber(123456789);
        timsAccount.setCustName("Tim Currell");
        timsAccount.setCustEmail("schmucky@theclown.com");
        timsAccount.setCustPhone("503-953-0129");

        String depositResult1 = timsAccount.accountDeposit(50.00);
        System.out.println("Deposit of $50.00 -- result is " + depositResult1);

        String withdrawalResult1 = timsAccount.accountWithdrawal(80.00);
        System.out.println("Withdrawal of $80.00 -- result is " + withdrawalResult1);

        String withdrawalResult2 = timsAccount.accountWithdrawal(90.00);
        System.out.println("Withdrawal of $90.00 -- result is " + withdrawalResult2);

        System.out.println("Account number:  " + timsAccount.getAcctNumber());
        System.out.println("Account balance:  $" + timsAccount.getAcctBalance());
        System.out.println("Account customer name:  " + timsAccount.getCustName());
        System.out.println("Account customer email:  " + timsAccount.getCustEmail());
        System.out.println("Account customer phone:  " + timsAccount.getCustPhone());

    }
}
