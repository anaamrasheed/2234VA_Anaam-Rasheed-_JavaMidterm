package string.problems;

public class Palindrome {

    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called a palindrome.
            Example: MOM, DAD, MADAM are palindromes.

            Write a method to check if a given String is a palindrome or not.*/







        String s1= "MADAM";         //given string
        String reverse = "";        /* reverse of the given string. it's empty right now. we want to take the last
                                    index of the given string, and add it to the 1st index of the reverse.
                                    if both strings are the same, it is a palindrome.*/


        //start the loop at last index of given string. s1.length()-1 gives you how many index values there are. Index
        //values always start with 0.    so in this case, loop will start at M because it is 4th index value.

        //Run the loop until the index value reaches 0. so until it is greater than -1.
        //At the end of each loop, decrement the index value by 1. so go from 4, 3, 2, 1, 0


        for(int index=s1.length()-1; index>-1 ; index--){
            reverse+=s1.charAt(index);                  //at the end of each loop, add each character of s1 onto
                                                        //the empty string "reverse".
                                                        //so starting from the last character of s1 (M), add M for 0th
                                                    //index value of reverse. M, A, D, A,
                                // += operator adds on characters or adds numbers

        }
        System.out.println(reverse);

    if (s1.equals(reverse)) {                                  //if s1 is the same as the reverse (of s1)
        System.out.println("The given string is a palindrome.");    //then the string is a palindrome.
    }else System.out.println("The given string is a not a palindrome.");




    }
}
