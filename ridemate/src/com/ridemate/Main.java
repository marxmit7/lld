package ridemate.src.com.ridemate;

import ridemate.src.com.ridemate.matching.MatchingAlgorithm;
import ridemate.src.com.ridemate.matching.ProximityMatchingAlgorithm;
import ridemate.src.com.ridemate.services.MatchingService;
import ridemate.src.com.ridemate.data.entities.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception{
        System.out.println("ridemate");


        MatchingAlgorithm matchingAlgorithm = new ProximityMatchingAlgorithm();
        MatchingService matchingService = new MatchingService(matchingAlgorithm);
        RidemateServiceFacade ridemateServiceFacade = new RidemateServiceFacade(matchingService);

        for(int i=0;i< 1000;i++){
            User user = new User("userId_"+i, "userName_"+i,generateRandomDigitNumber(), generateRandomDigitNumber()+"@gmail.com","name_"+i);
            ridemateServiceFacade.registerUser(user);
        }

        for(int i=100;i< 110;i++){
            System.out.println(ridemateServiceFacade.getRegisteredUserById("userName_"+i).getName());
        }
    }

  
    private static String generateRandomDigitNumber() {
        Random random = new Random();
        return Integer.toString(random.nextInt(900000000));
    
    }
}