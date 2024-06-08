package authenticator.src.com.authenticator;

public class Main{
    public static void main(String[] args) throws Exception{
        UserService userService = UserService.getInstance();
        TokenService tokenService = TokenService.getInstance();
        AuthenticatorFacade authenticatorFacade = new AuthenticatorFacade(userService, tokenService);

        authenticatorFacade.registerUser("amit", "kumar");
        String token = authenticatorFacade.getToken("amit", TokenType.TOTP);

        System.out.println("token: "+token);

    }
}