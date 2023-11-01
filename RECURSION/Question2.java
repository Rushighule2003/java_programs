package RECURSION;
// Print factorial of n;
// if n=5;
// 5! = 5*4*3*2*1 = 120


public class Question2 {

    public static void printFacto(int n,int facto){
        
        if(n==1){
            System.out.println(facto);
            return;
        }

        facto *= n;

        printFacto(n-1, facto);
    }
    public static void main(String[] args) {
        // int num =5 ;
        // int facto = 1;
        // for(int i=num;i>0;i--){
        //     facto = facto*i;
        // }

        printFacto(6, 1);
    }
}
