package atm.src.com.atm;

public class ATMFacade{
    private BankServer bankServer;
    private CardReader cardReader;
    private CashDispenser cashDispenser;

    public ATMFacade(BankServer bankServer, CardReader cardReader, CashDispenser cashDispenser){
        this.bankServer = bankServer;
        this.cardReader = cardReader;
        this.cashDispenser = cashDispenser;
    }

    public void start(){
        System.out.println("connecting with Bank Server...");
        System.out.println("Connected to Bank Server!");
        System.out.println("Initializing cash dispenser");
        System.out.println("Cash Dispenser initialized");
        System.out.println("Initialing system hardware");
        System.out.println("ATM machine started!!!");
    }
}