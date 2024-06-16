package ridemate.src.com.ridemate;

import ridemate.src.com.ridemate.matching.MatchingAlgorithm;
import ridemate.src.com.ridemate.matching.ProximityMatchingAlgorithm;
import ridemate.src.com.ridemate.services.MatchingService;
import ridemate.src.com.ridemate.data.entities.*;
import java.util.*;

import javafx.util.Pair;

public class Main{
    public static void main(String[] args) throws Exception{
        System.out.println("ridemate");

        System.out.println("initiating application");

        MatchingAlgorithm matchingAlgorithm = new ProximityMatchingAlgorithm();
        MatchingService matchingService = new MatchingService(matchingAlgorithm);
        RidemateServiceFacade ridemateServiceFacade = new RidemateServiceFacade(matchingService);
        System.out.println("application initialized");
        System.out.println("registering users");
        for(int i=0;i< 1000;i++){
            User user = new User("userId_"+i, "userName_"+i,generateRandomDigitNumber(), generateRandomDigitNumber()+"@gmail.com","name_"+i);
            ridemateServiceFacade.registerUser(user);
        }
        System.out.println("users registered");
        System.out.println("creating riderequest");


        List<RideRequest> rideRequests = new ArrayList<>();

        for(int i=0;i< 500;i++){
            User user = ridemateServiceFacade.getRegisteredUserById("userName_"+i);
            RideRequest rideRequest = new RideRequest(generateRandomLocation(), generateRandomLocation(), user);
            // System.out.println("riderequest: "+ rideRequest.toString());
            rideRequests.add(rideRequest);
        }

        
        System.out.println("riderequest created");
        System.out.println("calling matching algorithm");
        List<Match> matchedRides = ridemateServiceFacade.findMatches(rideRequests, 10.0);

        System.out.println("size: "+matchedRides.size());

        for(Match matchedRide: matchedRides){
            System.out.println(matchedRide.toString());
        }

        System.out.println("completed");


    }

  
    private static String generateRandomDigitNumber() {
        Random random = new Random();
        return Integer.toString(random.nextInt(900000000));
    
    }

    private static Location generateRandomLocation() {
        Random random = new Random();
        double min = 0.5;
        double max = 99.5; 
        
        double randomLattitude = min + (max - min) * random.nextDouble();
        double randomLongitude = min + (max - min) * random.nextDouble();

        return new Location(randomLattitude, randomLongitude);
    
    }
}