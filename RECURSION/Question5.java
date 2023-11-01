package RECURSION;

//Reverse String



public class Question5 {

    public static void revString(int i,String str){

        if(i==0){
            System.out.println(str.charAt(i));
            return;
        }

    System.out.print(str.charAt(i));
    revString(i-1, str);
}
    public static void main(String[] args) {
        // String rev = "acba";
        // for(int i=rev.length()-1;i>=0;i--){
        //     System.out.print(rev.charAt(i));
        // }

        String str ="abcd";
        revString(str.length()-1,str);
    }
    
}
