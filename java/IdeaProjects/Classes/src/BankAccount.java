/**
 * Created by Tim on 7/30/2017.
 */
public class BankAccount {

    private int acctNumber;
    private double acctBalance;
    private String custName;
    private String custEmail;
    private String custPhone;

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
