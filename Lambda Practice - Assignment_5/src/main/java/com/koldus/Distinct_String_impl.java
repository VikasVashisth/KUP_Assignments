package com.koldus;

import java.util.stream.Collectors;

/*Implemented the Functional Interface*/
public class Distinct_String_impl {
    public Distinct_String returndistinctstring = (list1) -> {
        return list1.stream().distinct().collect(Collectors.toList());
    };
}
