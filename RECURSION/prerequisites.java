package RECURSION;

public class prerequisites {

    public static void printNum(int num){
        if(num>5)
        return;

        System.out.println(num);
        printNum(num+1);
    }
    public static void main(String[] args) {
        printNum(1);
    }
}
