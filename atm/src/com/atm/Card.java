package atm.src.com.atm;

public class Card{
    private String cardNumber;
    private String cvv;
    private String pin;

    public Card(String cardNumber, String cvv){
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    public Card(Card card){
        this.cardNumber = card.getCardNumber();
        this.cvv = card.getCvv();
    }

    private String getCardNumber(){
        return this.cardNumber;
    }
    private String getCvv(){
        return this.cvv;
    }
    public void setPin(String pin){
        this.pin = pin;
    }
}