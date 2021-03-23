package math.problems;

public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         If n = 10, then array will have 9 elements in the range from 1 to 10.
            For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).

         Write a method to find the missing number from the array.
         */
        int[] array = new int[] {10, 2, 1, 4, 5, 3, 7, 8, 6};





        //sum of the range 1-10. It is 0 right now, will end up with the SUM of the numbers 1, 2, 3, 4 etc.
        int sum = 0;
        //add the numbers in the range 1-10. start with i=1 and loop through till 10.
    for(int i =1; i<=10; i++ ){
        sum+=i;            //sum= sum+i. Adds the next number to the sum.
    }
    System.out.println(sum);




    int sum2= 0;                              //sum of the values of the given array.
    for(int i=0; i<(array.length); i++) {    //print out all values of the array.
        sum2+=array[i];                      // add each value of the array to 0. (sum2 starts with 0). ends up
                                                //with sum of all numbers in the array
        }
    System.out.println(sum2);                //sum of values of given array.

        System.out.println("Missing number from the given array: " +(sum-sum2));    //gives the difference of both sums
                                                                                    //which is the missing number in
                                                                                    //array.













    }
}
