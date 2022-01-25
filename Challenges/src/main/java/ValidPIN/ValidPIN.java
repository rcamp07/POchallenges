package ValidPIN;

import java.util.regex.*;


/*
*Java:

Create a function that will test if a string is a valid PIN or not via a regular expression.

A valid PIN has:

Exactly 4 or 6 characters.
Only numeric characters (0-9).
No whitespace.
Examples
validate("121317") ➞ true

validate("1234") ➞ true

validate("45135") ➞ false

validate("89abc1") ➞ false

validate("900876") ➞ true

validate(" 4983") ➞ false

Notes:
Empty strings should return 'false' when tested.
* */

public class ValidPIN {
    public static boolean ValidPIN(String pin){
        Pattern p = Pattern.compile("^([0-9]{4}|[0-9]{6})$");
        Matcher m = p.matcher(pin);
        boolean isValid = m.matches();
        return isValid;
    }
    public static void main(String[] args){
        System.out.println(ValidPIN("121317")); //true
        System.out.println(ValidPIN("1234"));  //true
        System.out.println(ValidPIN("45135"));  //false
        System.out.println(ValidPIN("89abc1"));  //false
        System.out.println(ValidPIN("900876"));  //true
        System.out.println(ValidPIN(" 4983"));  //false
        System.out.println(ValidPIN(""));  //false
    }
}
