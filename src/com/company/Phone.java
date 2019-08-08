package com.company;

import java.util.ArrayList;

public class Phone {
    private String number;
    private static boolean searchEquals = false;

    public Phone() {

    }

    public Phone(String number) {
        this.number = number;
    }


    public void registerPhone() {
        Network.addNumber(number);
    }

    public void call(String numberToCall) {

        ArrayList<String> networkNumbers = Network.getNumbers();


        for (String number : networkNumbers) {

            if (number.equals(numberToCall)) {
                searchEquals = true;
                break;
            } else {
                searchEquals = false;
            }
        }



        if (searchEquals == true) {
            System.out.println("Outgoing call from " + number + " to " + numberToCall);
        } else {
            System.out.println("Wrong number " + numberToCall);
        }
    }

}



