package atm.src.com.atm;

public class CashHandlerImpl implements CashHandler{
    private CashHandler nextHandler;
    private DenominationType denominationType;
    private int denominationValue;

    public CashHandlerImpl(CashHandler nextHandler, DenominationType denominationType){
        this.nextHandler = nextHandler;
        this.denominationType = denominationType;

        switch(denominationType){
            case HUNDRED:
                this.denominationValue = 100;
                break;
            case FIVE_HUNDRED:
                this.denominationValue = 500;
                break;
            case THOUSAND:
                this.denominationValue = 1000;
                break;
            default:
                this.denominationValue = 100;
        }
    }
    public void handleRequest(int amount){

        if(amount>=denominationValue){
            int cashCount = amount/denominationValue;
            int remainder = amount%denominationValue;

            System.out.println("Dispensing "+cashCount+" ₹"+denominationValue+" note");

            if(remainder!=0 && nextHandler!=null){
                nextHandler.handleRequest(remainder);
            }
        } else if(nextHandler!=null){
            nextHandler.handleRequest(amount);
        }

    }

    public void setNextHandler(CashHandler nextHandler){
        this.nextHandler =nextHandler;
    }

}