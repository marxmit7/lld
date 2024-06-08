package authenticator.src.com.authenticator;

public class AuthenticatorFacade {
    private UserService userService;
    private TokenService tokenService;

    public AuthenticatorFacade(UserService userService, TokenService tokenService){
        this.userService = userService;
        this.tokenService = tokenService;
    }

    public void registerUser(String userNmae, String password) throws Exception{
        this.userService.registerUser(userNmae,password);
    }

    public boolean loginUser(String userNmae, String password) throws Exception{
        return this.userService.loginUser(userNmae,password);
    }

    public String getToken(String secret, TokenType tokenType){
        return this.tokenService.generateToken(secret, tokenType);
    }

}