package RECURSION;

// remove duplicates from from string aabbccdd => abcd ;

class Question9{

    public static boolean[] array = new boolean[26];

    public static void removeDupli(String str,int index,String newString){

        if(index== str.length()-1){
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(index);
        if(array[currChar-'a']==true){
            removeDupli(str, index+1, newString);
        }else{
            newString += currChar;
            array[currChar-'a']= true;
            removeDupli(str, index+1, newString);
        }
    }

    public static void main(String[] args) {

        String str = "aababadsjfandasba";

        removeDupli(str, 0, "");
    }
    
}