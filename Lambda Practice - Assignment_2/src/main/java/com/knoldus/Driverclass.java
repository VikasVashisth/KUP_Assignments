package com.knoldus;

import java.util.Scanner;

/* Main Class */
public class Driverclass {
    public static void main(String[] args) {
     
/*Taking the Inputs*/
  	 Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        long number= sc.nextLong();

/*Calling the Function*/
        Long nextEvenNumber =Even_number_next_impl.next_even_number.apply(Long.valueOf(number));
        System.out.println("Next Even number is : " +nextEvenNumber);
    }
}


