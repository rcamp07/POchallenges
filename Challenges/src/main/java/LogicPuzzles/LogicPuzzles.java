package LogicPuzzles;

/*
* Weekly Coding & Logical Reasoning Challenge:
Problem 1. Filter Out Strings from an Array

Create a function that takes an array of non-negative integers and strings and returns a new array without the strings.
Examples
filterArray([1, 2, "a", "b"]) ➞ [1, 2]
filterArray([1, "a", "b", 0, 15]) ➞ [1, 0, 15]
filterArray([1, 2, "aasf", "1", "123", 123]) ➞ [1, 2, 123]
Notes
Zero is a non-negative integer.
The given array only has integers and strings.
Numbers in the array should not repeat.
The original order must be maintained.

Problem 2 : Multiply by 11
Given a positive number as a string, multiply the number by 11 and also return it as a string. However, there is a catch:

You are NOT ALLOWED to simply cast the numeric string into an integer!

Now, how is this challenge even possible? Despite this, there is still a way to solve it, and it involves thinking about how someone might multiply by 11 in their head. See the tips below for guidance.

Examples
multiplyBy11("11") ➞ "121"
multiplyBy11("111111111") ➞ "1222222221"
multiplyBy11("1213200020") ➞ "13345200220"
multiplyBy11("1217197941") ➞ "13389177351"
multiplyBy11("9473745364784876253253263723") ➞ "104211199012633638785785900953"
Tip
There is a simple trick to multiplying any two-digit number by 11 in your head:

Add the two digits together
Place the sum between the two digits!
Note if the total goes over, carry the sum on to the next digit
// 23 * 11
// Add together 2 and 3 to make 5
// Place 5 between the two digits to make 253
// 77 * 11
// Add together 7 and 7 to make 14
// Place 4 between the two digits to make 747
// Carry the 1 to make 847

3. Logical Reasoning Question:
In this logic question, you are standing in a room with three light switches. The switches all correspond to three different light bulbs in an adjacent room that you cannot see into. With all the light switches starting in the off position, how can you find out which switch connects to which light bulb?
* */

import java.util.ArrayList;

public class LogicPuzzles {

    public static ArrayList<Integer> filterArray(Object[] e){
        ArrayList<Integer> nums = new ArrayList<>();

        for (Object a : e){
            if (a instanceof Integer && !nums.contains(a)){
                nums.add((Integer) a);
            }
        }
        return nums;
    }

    public static String multiplyBy11(String a) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(Character.getNumericValue(a.charAt(0)));
        for (int i = 0; i < (a.length()-1); i++) {
            int first = Character.getNumericValue(a.charAt(i));
            int second = Character.getNumericValue(a.charAt(i+1));
            int temp = first + second;
            if ((temp/10) > 0) {
                int tens = temp/10;
                int ones = temp%10;
                list.set(list.size()-1,list.get(list.size()-1)+tens);
                list.add(ones);
            } else {
                list.add(temp);
            }
        }
        list.add(Character.getNumericValue(a.charAt(a.length()-1)));
        String result = "";
        for (int l : list) {
            result = result + "" + l;
        }
        return result;
    }

    /*
    * Problem 3
    * Turn on switches 1 and 2. Turn off 2 after it is warm.
    * Light that is one goes to switch 1. Light that is off but warm goes to switch 2.
    * light that is off and cold goes to switch 3.
    * */

    public static void main (String[] args){
        Object[] in = new Object[]{"Test", 3 , 7, "Word", 157};
        System.out.println(filterArray(in));


        System.out.println("***************************");

        System.out.println(multiplyBy11("11"));
        System.out.println(multiplyBy11("111111111"));
    }

}
