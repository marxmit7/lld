package authenticator.src.com.authenticator;

public interface TokenGenerationStrategy{
    String generateToken(String secret);

}