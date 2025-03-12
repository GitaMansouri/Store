package payment;

public class CreditCardPayment implements PaymentStrategy {
    public String cardNumber;
    public String cardHolderName;

    public CreditCardPayment(String CardNumber ,String cardHolderName){
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public double pay(double amount){
        return amount;
    }

    @Override
    public String getPaymentDetails(){
        System.out.println("Pay with creditCard that owned by" + cardHolderName + "with card number:" + cardNumber);
    }

}

