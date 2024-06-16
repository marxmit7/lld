package ridemate.src.com.ridemate.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Database{
    private static Database instance;
    // private Connection connection ;

    private Database() throws SQLException{
        String url = "jdbc:mysql://localhost:3306/ridemate";
        String username = "root";
        String password = "password";
        // this.connection = DriverManager.getConnection(url, username, password);

    }

    public static Database getInstance() throws SQLException{
        if(instance==null){
            synchronized(Database.class){
                instance = new Database();
            }
        } 
        // else if(instance.getConnection().isClosed()){
        //     instance = new Database();
        // }

        return instance;
    }

    // private Connection getConnection(){
    //     return this.connection;
    // }
}