//Array problem 1 :
// take a matrix as input from user 
// search for a given number x and 
// print the cell in which it occurs ;


import java.util.Scanner;

public class a2D_Array {
    public static void main(String[] args) {
        int[][] matrix = new int[2][3];
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<2;i++){
            for (int j =0;j<3;j++){
                System.out.println("enter element for cell (" + i + "," + j + ")");
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("matrix is as follows");
        for (int i=0;i<2;i++){
            for (int j =0;j<3;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("enter a num for which u want to take input");
        int n =sc.nextInt();

        for (int i=0;i<2;i++){
            for (int j =0;j<3;j++){
                if(n==matrix[i][j]){
                    System.out.println(n + " belong to the cell (" + i + "," + j + ")");
                }
            }
        }
        sc.close();
    }
}
