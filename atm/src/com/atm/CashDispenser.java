package atm.src.com.atm;


public class CashDispenser{
    private static CashDispenser cashDispenser ;
    private double cash;
    private CashHandler cashHandler;

    private CashDispenser(double cash,CashHandler cashHandler){ 
        this.cash = cash;
        this.cashHandler = cashHandler;
    }

    public static CashDispenser getInstance(int initialCash){
        if(cashDispenser == null)
             cashDispenser = new CashDispenser(initialCash, initializeCashHandler());

        return cashDispenser;
    }

    public double getAvailableCash(){
        return this.cash;
    }
    public boolean validatAmount(int amount){

        if(amount%100!=0){
            System.out.println("Enter amount such that it's a multiple of 100");
            return false;
        }
        return true;
    }

    public double dispense(int amount){

        if(getAvailableCash()<amount){
            System.out.println("Atm doesn't have cash");
            return 0;
        } else {
            cashHandler.handleRequest(amount);
            this.cash-=amount;
        }
        return amount;
    }

    private static CashHandler initializeCashHandler(){
        CashHandlerImpl hundredRupeeCashHandlerImpl = new CashHandlerImpl(null, DenominationType.HUNDRED);
        CashHandlerImpl fiveHundredRupeeCashHandlerImpl = new CashHandlerImpl(hundredRupeeCashHandlerImpl, DenominationType.FIVE_HUNDRED);
        CashHandlerImpl thousandRupeeCashHandlerImpl = new CashHandlerImpl(fiveHundredRupeeCashHandlerImpl, DenominationType.THOUSAND);

        return thousandRupeeCashHandlerImpl;
    }

}