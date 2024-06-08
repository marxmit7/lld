package authenticator.src.com.authenticator;

public class TokenService {
    private static TokenService instance ;

    private TokenService(){}

    public static synchronized TokenService  getInstance(){
        if(instance==null){
            instance = new TokenService();
        }
        return instance;
    }

    public String generateToken(String secret, TokenType tokenType){
        return TokenGenerationFactory.createToken(tokenType).generateToken(secret);
    }
}