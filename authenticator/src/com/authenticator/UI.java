package authenticator.src.com.authenticator;

public class UI implements Observer{

    private String token;

    @Override
    public void update(String newToken){
        this.token = newToken;
    }

    public void viewToken(){
        System.out.println("latestToken: "+token);
    }

}