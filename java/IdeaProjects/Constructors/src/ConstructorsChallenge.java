/**
 * Created by Tim on 7/30/2017.
 */
public class ConstructorsChallenge {

    public static void main(String[] args) {

        VIPCustomer matt = new VIPCustomer();
        VIPCustomer sophia = new VIPCustomer("Sophia", 10000.00);
        VIPCustomer thomas = new VIPCustomer("Thomas",5000.00, "turtle@bestbuy.com");

        System.out.println("VIP customer name:  " + matt.getName());
        System.out.println("Customer credit limit:  " + matt.getCreditLimit());
        System.out.println("Customer email address:  " + matt.getEmailAddress() + "\n\n");

        System.out.println("VIP customer name:  " + sophia.getName());
        System.out.println("Customer credit limit:  " + sophia.getCreditLimit());
        System.out.println("Customer email address:  " + sophia.getEmailAddress() + "\n\n");

        System.out.println("VIP customer name:  " + thomas.getName());
        System.out.println("Customer credit limit:  " + thomas.getCreditLimit());
        System.out.println("Customer email address:  " + thomas.getEmailAddress() + "\n\n");
    }
}
