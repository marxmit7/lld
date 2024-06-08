package authenticator.src.com.authenticator;

import java.util.*;
public class TOTPTokenGeneration extends Token{

    @Override
    public String generateToken(String secretToken){
        return generateRandomSixDigitNumber().toString();
    }

    private static Integer generateRandomSixDigitNumber() {
        Random random = new Random();
        return random.nextInt(900000) + 100000;
    
    }
}
