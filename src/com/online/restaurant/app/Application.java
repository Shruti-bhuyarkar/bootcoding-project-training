package com.online.restaurant.app;

import com.online.restaurant.Customer;
import com.online.restaurant.Order;
import com.online.restaurant.Vendor;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        Customer shruti = new Customer();

        shruti.setName("Shruti");
        shruti.setCity("Nagpur");
        shruti.setAddress("Tukdoji square");
        shruti.setState("Maharashtra");
        shruti.setEmailid("bhuyarkarshruti4@gmail.com");
        shruti.setPhoneNumber(7888001880L);

        System.out.println("Customer detail : ");
        System.out.println("Name : " + shruti.getName());
        System.out.println("City : " +shruti.getCity());
        System.out.println("Address : "+ shruti.getAddress());
        System.out.println("State : "+ shruti.getState());
        System.out.println("Email-Id : "+shruti.getEmailid());
        System.out.println("Phone : "+ shruti.getPhoneNumber()+"\n");

        Vendor haldiram = new Vendor();
        haldiram.setName("Haldiram veg Restaurant");
        haldiram.setAddress("Medical square");
        haldiram.setCategory("Veg");
        haldiram.setPhonenumber(0712-223344L);
        haldiram.setRatting(5.0);
        haldiram.setCity("Nagpur");
        haldiram.setState("Maharashtra");

        System.out.println("Vendor Details :");
        System.out.println("Name :"+haldiram.getName());
        System.out.println("Address :"+haldiram.getAddress());
        System.out.println("Category :"+haldiram.getCategory());
        System.out.println("Phone :"+haldiram.getPhonenumber());
        System.out.println("Rating :"+haldiram.getRatting());
        System.out.println("State :"+haldiram.getState());
        System.out.println("City :"+haldiram.getCity()+"\n");


        Order order = new Order();
        order.setCustomer(shruti);
        order.setOrderDate(new Date());
        order.setDeliveryAddres("101, civil lines, Nagpur");
        order.setVendor(haldiram);
        order.setTotalAmount(999.00);

        System.out.println("Order Details :");
        System.out.println("Customer :"+order.getCustomer());
        System.out.println("Order Date :"+order.getOrderDate());
        System.out.println("Delivery Address :"+order.getDeliveryAddres());
        System.out.println("Vendor :"+order.getVendor());
        System.out.println("Total Amount :"+order.getTotalAmount()+"\n");





    }
}
