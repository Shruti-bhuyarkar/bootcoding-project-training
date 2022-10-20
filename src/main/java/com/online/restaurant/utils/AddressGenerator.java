package com.online.restaurant.utils;

import java.util.Random;

public class AddressGenerator {
    private static  String[] addresses ={"KR Pandav College, New Nandanwan ",
                        " VR mall, medical square", " Beside Haldiram , Ajni Square", "Bhole Petrol pump, civil lines"
                            , " opposite Batukbhai jewellers , Dharampeth", "Sangam mithai , Manish nagar"};

    public  static  String getAddress() {
        Random random = new Random();
        int randomIndex = random.nextInt(addresses.length);
        String address = addresses[randomIndex];
        System.out.println("Address = " + address);
        return address;
    }
    public static void main(String[] args){
        AddressGenerator.getAddress();

    }
}
