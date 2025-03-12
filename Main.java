import payment.*;

public interface PaymentStrategy{
    void pay(double amount);
    String getPaymentDetails();
}

public class Main {
    PremiumCustomer customer1 = new PremiumCustomer("Gita");
    RegularCustomer customer2 = new RegularCustomer("Amir");
    PremiumCustomer customer3 = new PremiumCustomer("Nilo");

    BitcoinPayment b = new BitcoinPayment();
    PaypalPayment p = new PaypalPayment();
    CreditCardPayment c = new CreditCardPayment();

    public CreditCardPayment getC() {
        return c;
    }

    public PaypalPayment getP() {
        return p;
    }

    public BitcoinPayment getB() {
        return b;
    }

    customer1.getB();
    customer1.getC();

    customer2.getP();
    customer2.getB();

    customer3.getP();
    customer3.getC();


    displayCustomerInfo(customer1);
    displayCustomerInfo(customer2);
    displayCustomerInfo(customer3);

    paymentHistory(customer1);
    paymentHistory(customer2);
    paymentHistory(customer3);

}
