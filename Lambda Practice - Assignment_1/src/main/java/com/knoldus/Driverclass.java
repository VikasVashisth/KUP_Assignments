package com.knoldus;

import java.util.Scanner;

/* Main class to call the function implementation*/

public class Driverclass {
    public  static void main(String[] args)
    {
        Max_number_impl max_number_impl=new Max_number_impl();

	/*Taking the Inputs*/

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

	/*Calling the function*/
        int result =max_number_impl.maxnumber(num1,num2);
        System.out.println(result);
}
}
