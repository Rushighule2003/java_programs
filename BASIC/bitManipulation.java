import java.util.Scanner;

public class bitManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a num to get bit ");
        int n= sc.nextInt();
        

    // 1) GET BIT operation

            // step 1: bit mask
            // step 2: AND operation and check zero or non-zero

            // example : get a third bit (position : 2) of num n (n=0101 or n=5)

            // System.out.println("enter a position at u want to get bit (it should be '0000' 1 to  4 )");
            // int i = sc.nextInt();

            //  int bitMask = 1<<(i-1);

            //  if((bitMask & n) == 0){
            //     System.out.println("bit at opsition "+i+" = 0");
            //  }else{
            //     System.out.println("bit at opsition "+ i+" = 1");
            //  }



    // 2) SET BIT operation : 

            //two steps 1)bit mask 
            //          2)or operation

            // System.out.println("enter a position at u want to get bit (it should be '0000' 1 to  4 )");
            // int i = sc.nextInt();


            // int bitMask = 1<<(i-1);

            // int newNumber = bitMask | n;

            // System.out.println(newNumber);

    
    
    // 3) CLEAR BIT operation

            //step 1> bit mask
            //     2> take not of bit mask and perform and with given num bits
                
                // System.out.println("enter a position at u want to get bit (it should be '0000' 1 to  4 )");
                // int i = sc.nextInt();

                // int bitMask = 1<<(i-1);

                // int newNumber = (~bitMask) & n;

                // System.out.println(newNumber);

    
    // 4) Update Bit operation

            // It is simply a combination of clear bit and set bit 
            // we can do it with using if else condition
            
            System.out.println("if u want to set bit(0->1) enter 1 \n if you want to clear bit(1->0) enter 0");
            int operation = sc.nextInt();

            if(operation == 1){
                System.out.println("enter a position at u want to set bit (it should be '0000' 1 to  4 )");
                int i =sc.nextInt();

                int bitMask = 1<<(i-1);
                int nextNum = bitMask | n;
                System.out.println(nextNum);
            }else{
                System.out.println("enter a position at u want to clear bit (it should be '0000' 1 to  4 )");
                int i =sc.nextInt();

                int bitMask = 1<<(i-1);
                int nextNum = (~bitMask) & n;
                System.out.println(nextNum);
            }


             sc.close();

    }
}
