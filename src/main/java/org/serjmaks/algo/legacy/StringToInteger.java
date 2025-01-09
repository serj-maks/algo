package org.serjmaks.algo.legacy;

public class StringToInteger {
    public static int run(String s) {
        int i = 0;
        int sign = 1;
        long num = 0;
        char[] chars = s.toCharArray();

        /*
        if move this check somewhere else, compiler read this:
        "java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0"
         */
        if (chars.length == 0) {
            return 0;
        }

        char current = chars[i];


        // skip all the preceding whitespaces
        while (current == ' ') {
            i++;
            if (i == chars.length) {
                return 0;
            }
            current = chars[i];
        }

        /*
        check if there is either a '+' or '-' in front of the number, and if there is,
        set the Integer sign to reflect the current parity of the number
         */
        if (current == '-') {
            sign = -1;
            i++;
        } else if (current == '+') {
            sign = 1;
            i++;
        }

        // go through the rest of the characters in the string
        for (; i < chars.length; i++) {
            current = chars[i];

            /*
            if the character is not an Integer,
            then the Integer is done, and we just have to return whatever already got
             */
            if (current < '0' || current > '9') {
                break;
            /*
            if the current character is an Integer, then we have to append it to the existing number,
            and check if the number is going out of the Integer bounds
             */
            } else {
                num *= 10;
                num += current - '0';

                if (sign * num <= Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                } else if (sign * num >= Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
            }
        }

        // append the sign to the number and return the number
        num *= sign;
        return (int) num;
    }
}
