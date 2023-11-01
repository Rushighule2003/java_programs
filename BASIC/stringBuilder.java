public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hi");
        System.out.println(sb);

    //functions with string builder

    // 1) charAt()

        // System.out.println(sb.charAt(0));

    // 2) setCharAt(index, ano. char) :used to change char in string builder

        //   sb.setCharAt(0,'b');
        //   sb.setCharAt(1, 'y');
        //   System.out.println("changed string builder is : "+sb);
    
    // 3) insert( index , char) : to insert char into string

         //     sb.insert(1,'i');
         //     System.out.println(sb);

    // 4) delete(start index ,end index) used to delet characters from starting index to ending index;

            // sb.delete(1, 1); 
            // System.out.println(sb);
    
    //  5)append(" ") to append char at end 

            sb.append("hi");
            System.out.println(sb);

    }
}
