package com.online.restaurant.dao;


import java.sql.*;

public class DAOService {
    public Connection getConnection(){
        try {
            //1. Load JDBC Driver
            Class.forName("org.postgresql.Driver");
            //2.
            java.sql.Connection con = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
                            "1003");
            return con;
        }catch (Exception ex){
            ex.printStackTrace();

        }
        return null;
    }
}
