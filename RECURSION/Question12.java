package RECURSION;

// Advance level
// count total paths in maze to move from (0,0) to (n,m)

public class Question12 {
    
    public static int countMoves(int i,int j,int n,int m){

        if(i==n || j==m){
            return 0;
        }
        if(i == (n-1) && j == (m-1)){
            return 1;
        }

        int downMove = countMoves(i+1, j, n, m);

        int rightMove = countMoves(i, j+1, n, m);

        return downMove + rightMove;
    }

    public static void main(String[] args) {
        int n=3;
        int m=3;
        int totalpath = countMoves(0, 0, n, m);
        System.out.println(totalpath);
    }
}
