package payment;

public class BitcoinPayment implements {
    public String walletAddress;

    public BitcoinPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public double pay(double amount){
        return amount;
    }

    @Override
    public String getPaymentDetails(){
        System.out.println("Pay with Bitcoin that walletaddress is " + walletAddress);
    }
}