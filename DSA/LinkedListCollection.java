import java.util.LinkedList;
public class LinkedListCollection {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(5);
        ll.add(6);
        ll.add(7);
        ll.add(8);
        ll.addFirst(4);
        ll.remove(3);

        for(int i=0;i<ll.size();i++){
            System.out.print(ll.get(i) +" -> ");
        }
        System.out.println("NULL");
    }
}
