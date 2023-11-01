import java.util.*;
public class factorial{

    static void facto(int a){
        int temp=1;
        if(a<0){
            System.out.println("cant calculate fatorial for fibonaccy series ");
            return;
        }

        
        for(int i= a; i>=1 ;i--){
            temp = temp * i;
        }
        System.out.println(temp);
        return;
    }

    public static void main(String[] args) {
        System.out.println("enter a num");
        Scanner sc = new Scanner(System.in);   
        int m = sc.nextInt();
        facto(m);

        sc.close();
    }
}
