package com.bubblesort;

public class ReverseInteger {

    //here the question is normally reverse a 32-bit integer

    //when overflow happens return 0
    //if there is a zero, rm it from the sequence of numbers

    public static int reverse(int x){

        int rev = 0;

        while (x != 0) {
            int pop = x % 10;
            x /= 10;


            //taking care of overflow here
            if (rev > Integer.MAX_VALUE || (rev == Integer.MAX_VALUE && pop > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE || (rev == Integer.MIN_VALUE && pop < -8)) {
                return 0;
            }


            rev = rev * 10 + pop;
        }
        return rev;

    }

    public static void main(String[] args) {
        System.out.println(reverse(123));
        //yields 321
    }
}
