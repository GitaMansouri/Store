import payment.*;
import java.util.*;

public class Main {
    PremiumCustomer customer1 = new PremiumCustomer("Gita");
    PremiumCustomer customer2 = new PremiumCustomer("Nilo");
    RegularCustomer customer3 = new RegularCustomer("Amir");

    BitcoinPayment bitcoinPayment = new BitcoinPayment("4850993223");
    CreditCardPayment creditCardPayment = new CreditCardPayment("7438", "Nilo");
    PaypalPayment paypalPayment = new PaypalPayment("gita.mansouri.84@gmail.com");


    customer1.displayCustomerInfo();
    customer2.displayCustomerInfo();
    customer3.displayCustomerInfo();


    customer1.makePayment(bitcoinPayment,128);
    customer1.makePayment(creditCardPayment,5473);
    customer2.makePayment(paypalPayment,987);
    customer2.makePayment(creditCardPayment,3794);
    customer3.makePayment(paypalPayment,894);
    customer3.makePayment(bitcoinPayment,76);


    System.out.Showprintln("customer1 payment history:");
    premiumCustomer1.PaymentHistory();

    System.out.println("customer2 payment history:");
    customer2.ShowPaymentHistory();

    System.out.println("regularCustomer payment history:");
    customer3.ShowPaymentHistory();

}
