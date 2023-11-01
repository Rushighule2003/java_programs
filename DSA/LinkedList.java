class LinkedList{
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data =data;
            this.next =null;
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){

        Node newNode = new Node(data);
        
        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    public void deletefirst(){
        if(head == null){
            System.out.println("no node to delete");
            return;
        }

        head = head.next;
    }

    public void deleteLast(){
        Node lastNode = head.next;
        Node secondlastNode = head;

        if(head == null){
            System.out.println("no node to delete");
            return;
        }

        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondlastNode = secondlastNode.next;
        }

        secondlastNode.next = null;
    }

    public void printList(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        // if(head.next == null){
        //     System.out.println(head.data);
        // }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    // public void size(){
    //     Node currNode = head;
    //     int size = 0;
    //     while(currNode != null){
            
    //         size++;
    //         currNode = currNode.next;
    //     }
    //     System.out.println(size);
    // }

    public void deleteNthNode(int n){
        Node currNode = head;
        int size = 0;
        while(currNode != null){
            
            size++;
            currNode = currNode.next;
        }

        if(n== size){
            head = head.next;
            return;
        }
        
        int prevNodePosition = size - n ;
        Node prevNode = head;
        int i=1;
        while(i<prevNodePosition){
            prevNode = prevNode.next;
            i++;
        }
        prevNode.next = prevNode.next.next;
    }

    public void reverseList(){
        if(head == null || head.next == null){
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //update 

            prevNode = currNode;
            currNode = nextNode;
        }

        head.next = null;
        head =prevNode;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(5);
        ll.addLast(7);
        ll.addLast(8);
        ll.addLast(10);
        ll.addFirst(0);
        ll.addLast(0);
        ll.printList();
        ll.reverseList();
        ll.printList();
    }
}