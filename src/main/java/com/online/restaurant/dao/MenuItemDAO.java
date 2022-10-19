package com.online.restaurant.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MenuItemDAO {
    public static final String TABLE_NAME="app_menuitem";
    private  DAOService daoService;
    public MenuItemDAO(){
        // inside constructor
        daoService = new DAOService();}
    public void  createTable() {
        try{
            Connection con = daoService.getConnection();
            // 3.
            Statement stmt = con.createStatement();
            //4.
            String sql =" Select * from "+TABLE_NAME;
            String query =" CREATE TABLE IF NOT EXISTS "+ TABLE_NAME+ "( id bigint NOT NULL, "
                    + " vendor_id bigint ,"
                    + " menu_item_name text,"
                    + " price decimal ,"
                    + " category text ,"
                    + " is_veg bool,"

                    + " CONSTRAINT app_menuitem_pk PRIMARY KEY (id))";

            System.out.println(" Create Table Query : " + query);
            stmt.executeUpdate(query);

            ResultSet rs = stmt.executeQuery(sql);
            //5.
            while (rs.next()){
                System.out.println(" Name = "+rs.getString("name"));
                System.out.println("Address = "+rs.getString("address"));
                System.out.println(" City= "+rs.getString("city"));
                System.out.println(" State = "+rs.getString("state"));

            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
