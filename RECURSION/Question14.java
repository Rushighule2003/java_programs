package RECURSION;

// Advance level
// Find the number of ways in which you can invite 'n' people in party, either single or in pairs;

// Ex : if n = 1;
//      ways = 1;

//      if n = 2;
//      ways = (1,2),(1-2) = 2;
//      if n = 3;
//      ways = (1,2,3),(1,2-3),(2,1-3),(3,1-2) = 3;
//      if n = 4;
//      ways = (1,2,3,4),
//             (1,2,3-4),(1,3,2-4),(1,4,2-3)
//             (1-2,3,4),(1-2,3-4),(1-3,2,4),(1-3,2-4),(1-4,2,3),(1-2,2-3)
//           = 10            

public class Question14 {
    
    public static int printWays(int n){
        if(n<=1){
            return 1;
        }

        // invite in single

        int inviteSingle = printWays(n-1);

        // invite in pair 

        int invitePair = (n-1) * printWays(n-2);
        
        return inviteSingle + invitePair;
    }

    public static void main(String[] args) { 
        int waysToInvite = printWays(4);
        System.out.println(waysToInvite);
    }
}
