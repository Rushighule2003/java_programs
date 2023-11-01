package RECURSION;

// Print x^n (stack height = n)

public class Question4 {

    public static int printPower(int x,int n) {
        if(n==0){
            return 1; 
        }

        if(x==0){
            return 0;
        }

        int  ans=printPower(x, n-1);
        int finalans= x * ans;
          return finalans;
        
        
    }
    public static void main(String[] args) {
        int x=5;
        int n=3;
        int ans = printPower(x, n);

        System.out.println(ans);
    }

    // here height is = n + 1 ;  

     
}
