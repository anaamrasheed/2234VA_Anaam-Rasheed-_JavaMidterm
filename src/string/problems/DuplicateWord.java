package string.problems;

import java.util.*;

public class DuplicateWord {

    public static void main(String[] args) {

//        /*
        //Write a java program to find the duplicate words and their number of occurrences in the string.
        // Also Find the average length of the words.


        String t1 = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";


        //Convert String to lowercase.
        t1.toLowerCase();


        //I want to Split the String into a word array.

        String[] words = t1.split(" ");   // When I use split with regex "", it splits by every character. but I want it
        //to split at every word. so simply add a space between the "" so split at every word.

        System.out.println(words);

        //add all words into a map
        Map<String, Integer> wordMap = new HashMap<String, Integer>();

        // {
        //    "java": 2,
        //    "is": 1
        //
        // }
        // ["java", "is"]
        //Add a 1 on the map for each word that is on the map (key, value)
        //If a word is already on the map, then increment its value by +1 to count duplicates.
        //how the the string is split right now --> ["java", " ",  "is",  " ", "a", " ", "programming", "Language.", " ", Java is also an Island of Indonesia. Java is widely used language]

        for (String str : words) {               //loop through each word (str) of the array (words)
            if (wordMap.get(str) != null) {      // if the word is not(null) on the map as a key...(meaning it is already on the map once)
                wordMap.put(str, wordMap.get(str) + 1); //then add a +1 to its value. to find duplicates. Starting with "java, is, a,
                                                                // ...etc" if its already on the map with a value of 1, now itll be 2.
            } else {
                wordMap.put(str, 1);     //if the value of a word is null (0) on the map as a key, then CREATE the key and add a 1 to its value
                                            //for ex: Java will get a 1. then when it loops again Java will add a 1 to the previous 1.
            }
        }
        //Print only the duplicate words and the number of occurrences
        Set<String> str2 = wordMap.keySet();
        ArrayList<String> answer = new ArrayList<>();

        for (String str : str2) {
            if (wordMap.get(str) > 1) {
                System.out.println("The duplicate words in the given string are: " + str);
            }
        }

        for (String str : str2) {
            if(wordMap.get(str) > 1) {
                answer.add(str);
            }
        }

    }
}