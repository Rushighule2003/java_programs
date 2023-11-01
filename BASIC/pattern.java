import java.util.*;

public class pattern {
    // public static void main(String[] args) {

    //     for(int j=1;j<=5;j++){
    //         System.out.println();
    //     for(int i=1;i<=5;i++){
    //         System.out.print("*");
    //     }
    //   }
    // }

    // output:

    // //*****
    // //*****
    // //*****
    // //*****
    // //*****

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.println("enter matrix value for m & n");
    //     System.out.print("m :");
    //     int m= sc.nextInt();
    //     System.out.print("n :");
    //     int n= sc.nextInt();

    //     for(int i=1;i<=m;i++){
    //         for(int j=1;j<=n;j++){
    //             if(i==1 || j==1 || i==m || j==n){
    //                 System.out.print(" * ");
    //             }
    //             else{
    //                 System.out.print("   ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    // //output :

    // // * * * * *
    // // *       *
    // // *       *
    // // * * * * *

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter n to create star pyramid");

        //  int n =sc.nextInt();

        // // * * *
        // // * * 
        // // * 

        //  for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        //  }

        // //      *  i=1  (n-i)
        // //    * *  i=2
        // //  * * *  i=3

        //  for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print("  ");
        //     }

        //     for(int k=1;k<=i;k++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        //  }

        // // * * * i=1 
        // //   * * i=2
        // //     * i=3

        // for(int i=n; i>=1; i--){
        //     for (int j=1;j<=n-i;j++){
        //         System.out.print("  ");
        //     }

        //     for (int k=1;k<=i;k++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // // 1
        // // 1 2
        // // 1 2 3 

        // for(int i = 1 ;i <= n ; i++){
        //     for(int j = 1 ; j<=i ;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        // // 1 2 3
        // // 1 2
        // // 1

        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        // // floyed's triangle
        // // 1           
        // // 2 3         
        // // 4 5 6       
        // // 7 8 9 10

        // int m=1;

        // for(int i=1 ; i<=n ; i++){
        //     for(int j=1 ; j<=i;j++){
        //         System.out.print(m+" ");
        //         m++;
        //     }
        //     System.out.println();
        // }

        // // 1             sum of i and j
        // // 0 1           i+j = even  =>1
        // // 1 0 1         i+j = odd   =>0
        // // 0 1 0 1       take it as in matrix form (1,1)= 1+1 = 2 = even =>print 1
        // // 1 0 1 0 1     2+1 = odd => print 0

        // for (int i=1 ; i<=n ; i++){
        //     for (int j=1 ;j<=i ;j++){
        //         if((i+j)%2 ==0){
        //             System.out.print("1 ");
        //         }
        //         if((i+j)%2 ==1){
        //             System.out.print("0 ");
        //         }
        //     }
        //     System.out.println();
        // }


        // // *         *     1) *            2) *         *     3) reverse and whole
        // // * *     * *        * *             * *     * *
        // // * * * * * *        * * *           * * * * * *
        // // * * * * * *               4) * * *             5) * * * * * * 
        // // * *     * *                  * *                  * *     * * 
        // // *         *                  *                    *         *
        
        // System.out.println();

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     for(int k=1;k<=(2*(n-i));k++){
        //         System.out.print("  ");
        //     }
        //     for(int l=1;l<=i;l++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // for(int o=n;o>=1;o--){
        //     for(int p=1;p<=o;p++){
        //         System.out.print("* ");
        //     }
        //     for(int q=1;q<=(2*(n-o));q++){
        //         System.out.print("  ");
        //     }
        //     for(int r=1;r<=o;r++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // //         * * * *
        // //       * * * *
        // //     * * * *
        // //   * * * *

        // for(int i=n;i>=1;i--){
        //     for(int j =1;j<=i;j++){
        //         System.out.print("  ");
        //     }
        //     for(int k=1;k<=n;k++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // //         1
        // //        2 2
        // //       3 3 3
        // //      4 4 4 4 
        // //     5 5 5 5 5

        // for(int i=1;i<=n;i++){
        //     for (int j=1;j<=(n-i);j++){
        //         System.out.print("  ");
        //     }
        //     for (int k=1;k<=i;k++){
        //         System.out.print(i+"   ");
        //     }
        //     System.out.println();
        // }

        // //           1
        // //         2 1 2
        // //       3 2 1 2 3
        // //     4 3 2 1 2 3 4

        // for(int i=0;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print("  ");
        //     }
        //     for(int k=i;k>=1;k--){
        //         System.out.print(k +" ");
        //     }
        //     for(int l=2;l<=i;l++){
        //         System.out.print(l +" ");
        //     }
        //     System.out.println();
        // }

        // //          *
        // //         * *
        // //        * * *
        // //       * * * *
        // //       * * * *
        // //        * * *
        // //         * *
        // //          *

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=1;k<=i;k++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i-1;j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=0;k<=n-i;k++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        sc.close();
    }
}
