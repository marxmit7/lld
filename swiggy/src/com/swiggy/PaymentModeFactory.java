package swiggy.src.com.swiggy;

public class PaymentModeFactory{

    public static  PaymentProcessor getPaymentDoneVia(String paymentMode) throws IllegalArgumentException{
        switch(paymentMode){
            case "cc":
                return  new CCPaymentProcessor();
            case "cod":
                return new CODPaymentProcessor();
            default :
                throw new IllegalArgumentException("unsupported exception");
        }
    }
}