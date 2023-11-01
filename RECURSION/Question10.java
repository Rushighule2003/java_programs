package RECURSION;

// print all subsequences of string abc => abc a b c ab ac bc _

public class Question10 {
    
    public static void subSequences(int index, String str, String newString){

        if(index == str.length()){
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(index);

        //
        subSequences(index+1, str, newString + currChar);

        //
        subSequences(index+1, str, newString);
    }

    public static void main(String[] args) {
        String str ="abc";
        subSequences(0, str, "");
    }
}
