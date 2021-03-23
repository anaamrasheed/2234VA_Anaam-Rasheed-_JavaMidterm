package math.problems;

import java.util.ArrayList;
import java.util.List;

import databases.ConnectToSqlDB;

public class LowestNumber {

    public static void main(String[] args) {
        /*
         Write a method to find the lowest number from this array.
         */

        int[] array = new int[] {211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};
                        //index   0,   1,  2,   3,  4,  5..
        // 110, 99, 34,

        int min = array[0];  // 0th index value of the array.

        for (int i=1; i<array.length; i++) {     //compare each number in array to the min(1st number of array, 0th index)
                                                // if it is less than the min, replace it.

            if (array[i] < min) {          //if each number in array is less than the 0th number of array
                min = array[i];          // then replace it.

            }
        }

        System.out.println("Lowest number from this array " +min); //should be outside the loop and if statement, if
                                                                      //you want it printed once.


    }

}
