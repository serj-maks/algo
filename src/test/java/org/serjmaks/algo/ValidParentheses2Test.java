package org.serjmaks.algo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParentheses2Test {

    @Test
    void run() {
        ValidParentheses2 validParentheses2 = new ValidParentheses2();
        String s = "(){}[]";
//        String s = "([}}])";

        boolean expected = true;
        boolean actual = validParentheses2.run(s);

        assertEquals(expected, actual);
    }
}