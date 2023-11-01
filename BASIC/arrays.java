import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        //int[] marks = new int[6];
        // int[] marks = {1,2,3,4,5,6};
        // marks[0]=10;
        // marks[5]=marks[1];

        Scanner sc = new Scanner(System.in);
         
        System.out.println("enter how many subject marks u want to enter (2 or 3)");
             int n =sc.nextInt();
             int[] marks = new int[n];
             

        
        switch(n){
            case 2:
            System.out.println("enter marks of");
             System.out.println("physics");
             marks[0]=sc.nextInt();
             System.out.println("chemestry");
             marks[1]=sc.nextInt();
             System.out.println("marks for respective subjects are :"); 
        for(int i=0;i<n;i++){
            System.out.println(marks[i]);
        }
             break;
            case 3:
            System.out.println("enter marks of");
              System.out.println("physics");
              marks[0]=sc.nextInt();
              System.out.println("chemestry");
              marks[1]=sc.nextInt();
              System.out.println("maths");
              marks[2]=sc.nextInt();
              System.out.println("marks for respective subjects are :"); 
        for(int i=0;i<n;i++){
            System.out.println(marks[i]);
        }
              break;
            default:
                System.out.println("enter valid sub number");

        }
        sc.close();
    
    }
}
