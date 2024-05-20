package atm.src.com.atm;

public class BankServer{
    private static BankServer instance;

    private BankServer(){
        System.out.println("Bank server instance has been created");
    };

    public static BankServer getInstance(){
        if(instance==null) return new BankServer();
        return instance;
    }

    public boolean checkAvailableBalance(Card card){
        return true;

    }

    public boolean validateAmount(Card card, double amount){
        return true;

    }

    public void authenticate(Card card){
        System.out.println("Card has been authenticated!");
    }

}