/**
 * Created by Tim on 7/30/2017.
 */
public class BankAccount {

    private int acctNumber;
    private double acctBalance;
    private String custName;
    private String custEmail;
    private String custPhone;

    // For every class, Java automatically creates a "constructor", a method that creates
    // a new instance of the class. This is invisible, but can be called just by using
    // the word 'new' and the name of the class, and assigning the new class instance a name.
    //
    // The constructor can be left alone, but it can also be overridden and a new custom
    // constructor authored to provide additional functionality when creating a new instance.

    public BankAccount() {
        System.out.println("Empty constructor called.");    // To verify that it has worked.
    }


    // Not only can you override the automatic constructor, but you can have MULTIPLE
    // constructors, just like you can have multiple methods with the same name and
    // different parameters.
    // In this constructor, you are allowed to pass in the initial parameters corresponding
    // to the various fields in the class. The constructor then does the initial "setup"
    // for you.

    public BankAccount(int acctNumber, double acctBalance, String custName,
                       String custEmail, String custPhone) {

        this.acctNumber = acctNumber;           // It is recommended that you assign
        this.acctBalance = acctBalance;         // the field values directly, instead
        this.custName = custName;               // of calling the setters. There are
        this.custEmail = custEmail;             // certain scenarios when calling the
        this.custPhone = custPhone;             // setter methods will not work.
    }


    // One funky little feature that is used in some instances is calling one constructor
    // from WITHIN another constructor. An example of this would be when you wanted to
    // assign default values in the event some data was missing. Calling another
    // constructor is done using the keyword 'this' by itself, including the appropriate
    // parameters for the constructor you are using. This must be the first statement
    // in the constructor.

    public BankAccount(int acctNumber, double acctBalance) {

        this(acctNumber, acctBalance, "NAME NOT ASSIGNED", "EMAIL NOT ASSIGNED", "PHONE NOT ASSIGNED");
    }


    public void setAcctNumber(int acctNumber) {
        this.acctNumber = acctNumber;
    }

    public void setAcctBalance(double acctBalance) {
        this.acctBalance = acctBalance;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }

    public double getAcctBalance() {
        return acctBalance;
    }

    public int getAcctNumber() {
        return acctNumber;
    }

    public String getCustName() {
        return custName;
    }

    public String getCustEmail() {
        return custEmail;
    }

    public String getCustPhone() {
        return custPhone;
    }

    public String accountDeposit(double depAmount) {
        this.acctBalance += depAmount;
        return "Deposit successful";
    }

    public String accountWithdrawal(double wdAmount) {
        if(this.acctBalance < wdAmount) {
            return "Insufficient funds";
        } else {
            this.acctBalance -= wdAmount;
            return "Withdrawal successful";
        }
    }
}
