package ridemate.src.com.ridemate;

import ridemate.src.com.ridemate.User.UserManager;
import ridemate.src.com.ridemate.data.Database;
import ridemate.src.com.ridemate.data.entities.RideRequest;
import ridemate.src.com.ridemate.data.entities.Match;
import ridemate.src.com.ridemate.data.entities.User;
import ridemate.src.com.ridemate.services.MatchingService;

import java.util.*;

import org.omg.CORBA.Request;

import javafx.util.Pair;

public class RidemateServiceFacade {
    private MatchingService matchingService;
    private Database database;
    private UserManager userManager;

    public RidemateServiceFacade(MatchingService matchingService) throws Exception{
        this.matchingService = matchingService;
        this.database = Database.getInstance();
        this.userManager = UserManager.getInstance();
    }

    public void registerUser(User user) throws Exception{
        userManager.register(user);
    }

    public void login(User user) throws Exception{
        userManager.login(user);
    }

    public Match rideMatch(RideRequest rideRequestA, RideRequest rideRequestB){
        return matchingService.findMatch(rideRequestA, rideRequestB);
    }

    public List<Match> findMatches(List<RideRequest> rideRequests, double threshold){
        return matchingService.findMatches(rideRequests, threshold);
    }

    public List<User> getAllRegisteredUser(){
        return userManager.getAllRegisteredUser();
    }

    public User getRegisteredUserById(String userId){
        return userManager.getRegisteredUserById(userId);
    }
}
