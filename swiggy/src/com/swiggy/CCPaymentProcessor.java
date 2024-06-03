package swiggy.src.com.swiggy;

public class CCPaymentProcessor implements PaymentProcessor{

    @Override
    public void processPayment(){
        System.out.println("payment processed by CC");
    }
}