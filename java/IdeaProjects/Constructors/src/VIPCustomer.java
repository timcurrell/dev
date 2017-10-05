/**
 * Created by Tim on 7/30/2017.
 */
public class VIPCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public VIPCustomer() {
        this("Name not specified", 0.00, "No email address");
    }

    public VIPCustomer(String name, double creditLimit) {
        this(name, creditLimit, "No email address");
    }

    public VIPCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
