package ridemate.src.com.ridemate.data.repositories;

import ridemate.src.com.ridemate.data.Database;
import ridemate.src.com.ridemate.data.entities.*;

import java.sql.SQLException;
import java.util.*;

public class RideRequestRepositoryImpl implements RideRequestRepository{

    private Database database;

    public RideRequestRepositoryImpl() throws SQLException{
        database = Database.getInstance();
    }

    @Override 
    public void save(RideRequest rideRequest){
        
    }

    @Override
    public RideRequest findById(String requestId){
        return null;
    }

    @Override
    public List<RideRequest> findAll(){
        return null;
    }
    
}
