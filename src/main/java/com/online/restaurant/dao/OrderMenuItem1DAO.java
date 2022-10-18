package com.online.restaurant.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OrderMenuItem1DAO {
    public static final String TABLE_NAME="ordermenuitem1";

    public void  createTable(){
        try{
            //1. Load JDBC Driver
            Class.forName("org.postgresql.Driver");
            //2.
            Connection con = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","1003");
// 3.
            Statement stmt = con.createStatement();
            //4.
            String sql =" Select * from "+TABLE_NAME;
            ResultSet rs = stmt.executeQuery(sql);
            //5.
            while (rs.next()){
                System.out.println(" Id = "+rs.getString("id"));
                System.out.println("Order Id = "+rs.getString("order_id"));
                System.out.println(" Quantity= "+rs.getString("quantity"));
                System.out.println(" Total Price= "+rs.getString("total_price"));

            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
