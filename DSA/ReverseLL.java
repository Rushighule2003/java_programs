public class ReverseLL{

    // at first make a simple linked list to perform further operations

    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data =data;
            this.next =null;
        }
    }

    //add at first function

    public void addF(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addL(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head ;
        while(currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    // delete function in java

    public void deleteFirst(){
        if(head == null){
            System.out.println("no node to delete");
        }

        head = head.next;
        return;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("no node to delete");
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }

        Node lastNode = head.next;
        Node secondlastNode = head;
        
        while(lastNode.next != null ){
            lastNode = lastNode.next;
            secondlastNode = secondlastNode.next;
        }

        secondlastNode.next = null;
    }

    public void printList(){

        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {
        ReverseLL ll = new ReverseLL();
        ll.addF(0);
        ll.addL(1);
        ll.deleteFirst();
        ll.deleteLast();
        ll.printList();
    }
}

