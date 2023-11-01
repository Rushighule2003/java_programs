import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        // To add elements in array list

        arr.add(0);
        arr.add(5);
        arr.add(4);
        arr.add(3);

        System.out.println(arr);

        // To get element 

        System.out.println(arr.get(3));

        // TO add element in between

        arr.add(0,1);

        System.out.println(arr);

        // To set/update element

        arr.set(0,13);
        System.out.println(arr);

        // To delete/remove element

        arr.remove(0);

        System.out.println(arr);

        // To count elements in arraylist

        System.out.println(arr.size());

        // To sort arraylist

        Collections.sort(arr);
        System.out.println(arr);
    }
}
