package payment;

public class PaypalPayment {
    String email;
    public PaypalPayment(String email){
        this.email = email;
    }

    @Override
    public double pay(double amount){
        return amount;
    }

    @Override
    public String getPaymentDetails(){
        System.out.println("Pay with Paypal that email is " + email);
    }
}