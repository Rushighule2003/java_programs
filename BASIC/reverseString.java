import java.util.*;

public class reverseString {
    // String revstring(String name){
    //     String ame = name;
    //     for(int i = name.length() ; i>=0;i--){
    //         System.out.print(ame.charAt(i));
    //     }
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String name = sc.nextLine();
        // String reverse = rev_string(name);
        // System.out.println("reversed string = "+reverse);
        System.out.print("reverse string = ");
        for(int i = name.length()-1 ; i>=0;i--){
            System.out.print(name.charAt(i));
        }

        sc.close();
    }
}
