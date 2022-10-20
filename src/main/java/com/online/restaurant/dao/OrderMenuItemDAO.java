package com.online.restaurant.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class OrderMenuItemDAO {
    public static final String TABLE_NAME="app_order_menu_item";

    private  DAOService daoService;
    public OrderMenuItemDAO(){
        // inside constructor
        daoService = new DAOService();}
    public void  createTable(){
        try{
      Connection con = daoService.getConnection();
// 3.c
            Statement stmt = con.createStatement();
            //4.
            String sql =" Select * from "+TABLE_NAME;
            String query =" CREATE TABLE IF NOT EXISTS "+ TABLE_NAME
                    + "( id bigint NOT NULL, "
                    + " order_id bigint ,"
                    + " quantity decimal,"
                    + " menu_item varchar ,"
                    + " total_price numeric ,"
                    + " is_veg bool,"
                    + " CONSTRAINT app_order_menu_item_pk PRIMARY KEY (id))";
            System.out.println(" Create Table Query : " + query);
            stmt.executeUpdate(query);
            ResultSet rs = stmt.executeQuery(sql);
            //5.
            while (rs.next()){
                System.out.println(" Id = "+rs.getString("id"));
                System.out.println("Order Id = "+rs.getString("order_id"));
                System.out.println(" Quantity= "+rs.getString("quantity"));
                System.out.println(" Total Price= "+rs.getString("total_price"));

            }
            con.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
