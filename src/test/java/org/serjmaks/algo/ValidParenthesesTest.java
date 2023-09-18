package org.serjmaks.algo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    @Test
    void run() {
        ValidParentheses validParentheses = new ValidParentheses();
        String s = "(){}[]";
//        String s = "([}}])";

        boolean expected = true;
        boolean actual = validParentheses.run(s);

        assertEquals(expected, actual);
    }
}