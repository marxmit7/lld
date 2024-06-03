package swiggy.src.com.swiggy;

public class CODPaymentProcessor  implements PaymentProcessor{

    @Override
    public void processPayment(){
        System.out.println("payment done via cod");
    }

}