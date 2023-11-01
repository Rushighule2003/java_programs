package RECURSION;

// Advance level
// Print all possible permutations of string
// Ex: abc =>
//            abc
//            acb
//            bac
//            bca
//            cab
//            cba

public class Question11 {

    public static void printpermu(String str,String permutation){

        if(str.length()==0){
            System.out.println(permutation);
            return;
        }

        for(int i=0;i<str.length();i++){
            char curchar = str.charAt(i);

            String newString = str.substring(0, i) + str.substring(i+1);

            printpermu(newString, permutation+curchar);
        }
    }

    
    
    public static void main(String[] args) {
        String str = "abc";

        printpermu(str, "");
    }
    
}
