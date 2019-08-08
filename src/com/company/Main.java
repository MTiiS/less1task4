package com.company;

public class Main {

    public static void main(String[] args) {
        Phone phone1 = new Phone("0631234567");
        phone1.registerPhone();

        Phone phone2 = new Phone("0632222222");
        phone2.registerPhone();

        Phone phone3 = new Phone("0633333333");
        phone3.registerPhone();

        Phone phone4 = new Phone("0634444444");
        phone4.registerPhone();

        phone4.call("0631234567");
        phone3.call("0630020200");
        phone3.call("0634444444");// write your code hereN


    }
}
