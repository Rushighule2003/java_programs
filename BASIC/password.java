import java.util.*;

public class password{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter username");
        String name = sc.next();
        System.out.println("enter password");
        int password = sc.nextInt();

        if(name != "rushi" && password != 1234567890){
            System.out.println("please correctly enter username and password");
        }
        else{
            System.out.println("u entered correctly");
        }
        sc.close();
    }
}