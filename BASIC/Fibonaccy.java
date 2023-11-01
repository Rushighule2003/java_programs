public class Fibonaccy {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int temp=0;
        int index=7;
        for(int i=0;i<index;i++){
            temp = a+b;
            a = b;
            b = temp;
        }
        System.out.println(temp);
        }
}
