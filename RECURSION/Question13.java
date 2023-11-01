package RECURSION;

// Advance level
// Place Tiles of size 1*m in a floor of size n*m;

// tile of size 1*2
//  |_|_|

// floor of size 2*2
//  |_|_|
//  |_|_|

// Question description :
//      you have to write code for finding out how many ways you can place tiles 
//      on the foor so it accurateliy occupy space
//      -> There are two base cases 
//      -> one is to when floor is n*m and n==m then the ways are two only;
//      -> second is when size of n < m then way is only one to place the tiles; 

public class Question13 {
    
    public static int countWays(int n,int m){
        if(n<m){
            return 1;
        }
        if(n==m){
            return 2;
        }

        // to place horizontally
        int placeHorizontal = countWays(n-1, m);
        // to place vertically
        int placeVertical = countWays(n-m, m);

        return placeHorizontal + placeVertical;
    }

    public static void main(String[] args) {
        int n=4,m=2;
        int totalCount = countWays(n, m);
        System.out.println(totalCount);
    }
}
