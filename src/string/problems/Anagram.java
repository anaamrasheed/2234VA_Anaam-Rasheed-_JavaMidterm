package string.problems;

import java.util.Arrays;
import java.util.Locale;

public class Anagram {

    /*
    Write a Java Program to check if two Strings are Anagrams.
        Two String are called Anagrams when both Strings use the same characters but in different order.
        Example: "CAT" and "ACT", "ARMY" and "MARY", "FART" and "RAFT"
    */

    public static void main(String[] args) {

        String w1 = "ARMY";
        String w2 = "MARY";


//        //Convert strings to lowercase
//        w1 = w1.toLowerCase();
//        w2 = w2.toLowerCase();

        //Check if the lengths of the strings are the same (not necessary)
        if (w1.length() == w2.length()) {


            //Convert strings to char arrays
            char[] charArrayW1 = w1.toCharArray();
            char[] charArrayW2 = w2.toCharArray();

            // Why does this not print an array with individual characters?
            // System.out.println(charArrayW1);

            //Sort the char arrays
            Arrays.sort(charArrayW1);
            Arrays.sort(charArrayW2);

            //If the sorted char arrays are the same, then the Strings are anagrams.
            boolean result = Arrays.equals(charArrayW1,charArrayW2 );




            if (result) {
                System.out.println(w1 + " and " + w2 + " are anagrams.");
            } else {
                System.out.println(w1 + " and " + w2 + " are not anagrams.");
            }


        }
    }
}

