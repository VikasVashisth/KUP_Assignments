package com.knoldus;

import java.util.Scanner;

/*Main Class*/
public class Driverclass {
    public static void main(String[] args) {

        /*Taking the Inputs*/
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter  left and right range ");

        long leftborder = sc.nextLong();
        long rightborder = sc.nextLong();
        ProductionInRangeBorder_impl productionInRange = new ProductionInRangeBorder_impl();

        /*Calling the Function*/
        long Result = productionInRange.productInRangeInterface.productionInRange(leftborder,rightborder);
        System.out.println("Result are: " +Result);
    }
}


