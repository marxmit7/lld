package authenticator.src.com.authenticator;

public abstract class Token {
    public abstract String generateToken(String secretKey);
}