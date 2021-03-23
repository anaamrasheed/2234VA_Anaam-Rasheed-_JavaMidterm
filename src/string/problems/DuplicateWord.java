package string.problems;

import java.util.*;

public class DuplicateWord {

    public static void main(String[] args) {

        /*
         Write a java program to find the duplicate words and their number of occurrences in the string.
            Also Find the average length of the words.
         */

        String t1 = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        //Convert String to lowercase.
        t1.toLowerCase();


        //Split the String into a word array
        //(If i enter the actual string into the quotes, the code doesnt do anything..?)
        String[] words = t1.split("");

        //add all words into a map
        Map<String, Integer> wordMap = new LinkedHashMap<String, Integer>();

        //Add a 1 on the map for each word that is on the map (key, value)
        //If a word is already on the map, then increment its value by +1 to count duplicates.
        for (String str : words) {
            if (wordMap.get(str) != null) {
                wordMap.put(str, wordMap.get(str) + 1);

            } else {
                wordMap.put(str, 1);
            }
        }
        //Print only the duplicate words and the number of occurrences
        Set<String> str2 = wordMap.keySet();
        for (String str : str2) {
            if (wordMap.get(str) > 1) {

            }

            System.out.println("The duplicate words in the given string are: " + str);
        }




    }



}






