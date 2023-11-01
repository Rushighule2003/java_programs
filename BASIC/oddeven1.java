import java.util.Scanner;

public class oddeven1 {
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
 
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter no. to check even or odd");

            int num = sc.nextInt();
            
            if(num % 2==0){
                    System.out.println("it is even num");
                }
            else{
                    System.out.println("it is odd num");
                }
        }
        sc.close();
    }
}
