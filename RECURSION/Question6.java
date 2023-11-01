package RECURSION;

// first and last occurence of element in string 

public class Question6 {

    public  static int first = -1;
    public  static int last = -1;

    public static void printIndex(int index,char ch,String str){

        if(index== str.length()){
            System.out.println("index of first element : " + first);
            System.out.println("index of last element : "+last );
            return;
        }

        char currChar = str.charAt(index);

        if(currChar==ch){
            if(first== -1){
                first = index;
            }else{
                last = index;
            }
        }

        printIndex(index + 1, ch, str);
    }
    public static void main(String[] args) {
        String str = "ababsbdbgjakl";
        // char ch = 'a';
        // for (int i=0;i<=str.length()-1;i++){
        //     if(str.charAt(i)==ch){
        //         System.out.println("first occurence at index = "+i);
        //         break;
        //     }
            
        // }
        // for (int i=str.length()-1;i>=0;i--){
        //     if(str.charAt(i)==ch){
        //         System.out.println("last occurence at index = "+i);
        //         break;
        //     }
        // }

        printIndex(0, 'a', str);
    }
}
