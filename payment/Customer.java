package payment;

import java.util.ArrayList;

public abstract class Customer {
    public String name;
    public ArrayList<String> paymentHistory;
    public String info;
    int i = 0;
    public Customer(String name){
        this.name = name;
        paymentHistory = null;
    }

    public abstract void displayCustomerInfo();

    public void makePayment(PaymentStrategy paymentStrategy, double amount){
        info = PaymentStrategy.getPaymentDetails() + "Pay mount is" + String.valueOf(PaymentStrategy.pay(amount));
        paymentHistory.add(info);

        public void showPaymentHistory(){
            for (int i = 0 ; i < paymentHistory.size() ; i++){
                System.out.println(paymentHistory.get(i));
            }
        }
    }
}
