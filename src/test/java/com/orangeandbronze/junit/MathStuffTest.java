package com.orangeandbronze.junit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathStuffTest { //The test class
    @Test
    void gcf_both_params_positive_and_same_value(){
        int x = 5;
        int y = 5;
        int expected = 5;
        int actual = new MathStuff().gcf(x, y); //instantiate a MathStuff object and call its gcf method
        assertEquals(expected, actual); //verify if actual is the same as expected

    }

    void gcf_both_params_positive_w_multiple_common_factors(){
        int x = 24;
        int y = 18;
        assertEquals(6, new MathStuff().gcf(x, y));
    }

}
