package ridemate.src.com.ridemate.services;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import ridemate.src.com.ridemate.data.entities.*;
import ridemate.src.com.ridemate.matching.MatchingAlgorithm;

public class MatchingService{
    private MatchingAlgorithm matchingAlgorithm;

    public MatchingService(MatchingAlgorithm matchingAlgorithm){
        this.matchingAlgorithm = matchingAlgorithm;
    }

    public Match findMatch(RideRequest rideRequestA, RideRequest rideRequestB){

        return this.matchingAlgorithm.findMatch(rideRequestA, rideRequestB);
    }


public static List<Match> findMatches(List<RideRequest> requests, double threshold) {
        List<Match> matches = new ArrayList<>();

        int n = requests.size();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                RideRequest req1 = requests.get(i);
                RideRequest req2 = requests.get(j);

                double sourceDistance = req1.getSource().distanceTo(req2.getSource());
                double destinationDistance = req1.getDestination().distanceTo(req2.getDestination());

                if (sourceDistance <= threshold && destinationDistance <= threshold) {
                    matches.add(new Match(req1, req2));
                }
            }
        }

        matches.sort(Comparator.comparingDouble(pair -> 
            pair.getMatch().getKey().getSource().distanceTo(pair.getMatch().getValue().getSource()) +
            pair.getMatch().getKey().getDestination().distanceTo(pair.getMatch().getValue().getDestination())
        ));

        return matches;
    }

}