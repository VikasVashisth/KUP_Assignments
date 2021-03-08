package com.knoldus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Max_number_implTest {
    @Test
    public void findmaxnumbertest() {
        Max_number_impl object = new Max_number_impl();
        int num = object.maxnumber(10, 10);
        Assertions.assertEquals(10, num);
    }
    @Test
    public void findmaxnumbertest1() {
        Max_number_impl object = new Max_number_impl();
        int num = object.maxnumber(10, 10);
        Assertions.assertEquals(10, num);
    }
    @Test
    public void findmaxnumbertest3() {
        Max_number_impl object2 = new Max_number_impl();

        object2.maxnumber(101, 100);
        Assertions.assertNotEquals(100, 101);
    }

}

