package RECURSION;

// move all x to the end of string xabxxbabx => abbabxxxx ;

public class Question8 {

    public static String newString="";

    public static void movX(String str,int index,int count){

        if(index==str.length()){
            for(int i=0;i<7;i++){
                newString +='x';
            }
            System.out.println(newString);
            return;
        }

        if(str.charAt(index)!='x'){
            newString += str.charAt(index);
            movX(str, index+1, count);
        }else{
            movX(str, index+1, count+1);
        }

        
    }

    
    public static void main(String[] args) {
        String str = "xxxxxxaxbxs";

        movX(str, 0, 0);

    }
}
