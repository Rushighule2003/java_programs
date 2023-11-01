import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your name");
        // String name = sc.nextLine();
        // System.out.println(name);

    //string operations

    //concatenation

        // String fname ="mata";
        // String lname ="lata";
        // String name = fname+"$"+lname;
        // System.out.println(name);

    //length()

        // System.out.println(name.length());

        //charAt()

        // String name = "hi there";
        // for (int i=0;i<name.length();i++){
        // System.out.println(name.charAt(i));
        // }
        // System.out.println(name.length());
        // }

    //compareTO

        //  String name1 ="cishi";
        //  String name2="ghule";

        //  if(name1.compareTo(name2) == 0){
        //     System.out.println("sstrings are equal");
        // }else if(name1.compareTo(name2) > 0){
        //     System.out.println("given string is big than another");
        // }else{
        //     System.out.println("string is smaller");
        // }

    //substring

            System.out.print("Enter your name : ");
            String name =sc.nextLine();

            System.out.print("enter the index from u want to make substring (start count from 0) :");
            int from = sc.nextInt();
            System.out.println("to : ");
            int to =sc.nextInt();


            System.out.print("substring of entered name : " + name.substring(from, to));

            sc.close();

    }

     
}
