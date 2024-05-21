package atm.src.com.atm;

public class Main{
    public static void main(String[] args){

        BankServer bankServer = BankServer.getInstance();
        CashDispenser cashDispenser = CashDispenser.getInstance(5000);
        CardReader cardReader = new CardReader();
        ATMFacade atmFacade = new ATMFacade(bankServer, cardReader, cashDispenser);

        atmFacade.start();

        System.out.println("enter atm card into machine ");
        Card card = new Card("abc","cv2");
        System.out.println("enter atm pin");
        String cardPin = "";
        card.setPin(cardPin);

        bankServer.authenticate(card);
        System.out.println("enter amount to dispense");

        int amount = 1900;
        if(cashDispenser.validatAmount(amount)){
            bankServer.validateAmount(card, amount);
            cashDispenser.dispense(amount);
        }

        System.out.println("remaining amount in atm machine is "+ cashDispenser.getAvailableCash());


        

    }
}