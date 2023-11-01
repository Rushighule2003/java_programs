import java.util.*;
class java {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        

        for(int i=0;i<5; i++){

        System.out.println("to print \n 'hello'- enter '1' \n 'hi'- enter '2' \n 'by'- enter '3'");
        int num = sc.nextInt();

        switch(num){
            case 1 : System.out.println("hello");
            break;
            case 2 : System.out.println("hi");
            break;
            case 3 : System.out.println("by");
            break;
            default: System.out.println("please enter correct number");

            sc.close();
        }
    }
    }
}