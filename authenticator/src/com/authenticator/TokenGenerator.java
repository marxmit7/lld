package authenticator.src.com.authenticator;

public class TokenGenerator{
    private TokenGenerationStrategy tokenGenerationStrategy;
    
    public TokenGenerator(TokenGenerationStrategy tokenGenerationStrategy){
        this.tokenGenerationStrategy = tokenGenerationStrategy;
    }

    public String generateToken(String secret){
       return  this.tokenGenerationStrategy.generateToken(secret);
    }
}