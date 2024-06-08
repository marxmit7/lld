package authenticator.src.com.authenticator;

public class TokenGenerationFactory{

    public static Token createToken(TokenType tokenType){
        switch (tokenType) {
            case TOTP:
                return new TOTPTokenGeneration();
            case HMAC:
                return new HMACBasedTokenGeneration();
                        
            default:
                throw new IllegalArgumentException();
        }

    }
}