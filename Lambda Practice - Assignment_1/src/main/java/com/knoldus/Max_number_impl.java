package com.knoldus;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*Implementing Functional Interface */

public class Max_number_impl implements Max_number{

    @Override
    public int  maxnumber(int num1, int num2) {

        List<Integer> list = Arrays.asList(num1,num2);
        Optional<Integer> op = list.stream().max((a, b) -> {
            System.out.println("Numbers are = " + a + "," + b);
            int maximumOfNumbers = Integer.compare(a,b);
            return maximumOfNumbers;
        });
        return op.get();

}
}
