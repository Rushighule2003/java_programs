//Array problem 1 :
// take an array as input from user 
// search for a given number x and 
// print the index at which it occurs ;


import java.util.*;

public class arrayProblem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numbers = new int[5];

        System.out.println("enter the 5 numbers in array");

            for(int i =0;i<5;i++){
                numbers[i]=sc.nextInt();
            }

        System.out.println("enter the number for which u want to find index");

            int n = sc.nextInt();
            for(int i =0;i<5;i++){
                if (n==numbers[i]){
                  System.out.println(n + " is at index " +i);
                }
            }

            sc.close();
    }
}
