import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * Created by axelntwari on 6/8/17.
 */
public class LinkedList<T> {

    private Node head;

    public LinkedList(){
        // Constructor
        head = null;
    }

    public LinkedList(T data){
        // Constructor with initialization of list
        head = null;
        add(data);
    }

    public Boolean isEmpty(){
        return true;
    }

    public void add(T data){
        // Creating a new node from the given data
        Node newNode = new Node(data);

        if(head == null){
            // If the linked list is empty, just make the head the new node
            head = newNode;

        } else {
            // Find the ending node and add the new node after that one.
            // Saves the previous node to be the node before the null one is found
            Node currentNode = head;
            Node prevNode = currentNode;
            while (currentNode != null) {
                prevNode = currentNode;
                currentNode = currentNode.getNext();
            }
            prevNode.setNext(newNode);
        }

    }

    public int size(){
        int count = 0;
        Node currentNode = head;
        while( currentNode != null){
            currentNode = currentNode.getNext();
            count++;
        }
        return count;
    }

    public Boolean search(T data){

        Node currentNode = head;

        while( currentNode.getData() != data && currentNode.getNext() != null ){
            currentNode = currentNode.getNext();
        }

        if (currentNode.getData() == data){
            return true;
        } else {
            return false;
        }
    }

    public void remove(T data){

        Node currentNode = head;
        Node previousNode = currentNode;
        while( currentNode.getData() != data && currentNode.getNext() != null ){
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }

        // Removes the currentNode only if the node with data exists
        if (currentNode.getData() == data){

            if (currentNode == head){
                //Dealing with deleting the headnode
                if (head.getNext() == null){
                    //If the headnode is the only one left
                    head = null;
                } else {
                    head = currentNode.getNext();
                }
            } else {
                previousNode.setNext(currentNode.getNext());
            }
        }

    }

    public String toString(){

        if (head == null){
            //If the LinkedList is empty
            return "";
        }

        String a = head + "";
        Node currentNode = head.getNext();
        while (currentNode != null) {
            a = a + " -> " + currentNode ;
            currentNode = currentNode.getNext();
        }

        return a;
    }

    public static void main(String[] args){

        LinkedList<Integer> a = new LinkedList<Integer>();

        a.add(0);
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);

        // TESTING SEARCH
        System.out.println(a);
        System.out.println("Search for 1: " + a.search(1));
        System.out.println("Search for 9: " + a.search(9));


        // TESTING SIZE
        System.out.println("Size of LinkedList: " + a.size());


        // TESTING DELETING
        a.add(5);
        a.add(6);
        a.add(7);
        System.out.println("Before deleting 5: "+ a);
        a.remove(5);
        a.remove(1000);
        System.out.println("After deleting 5: "+ a);

        //Creating a Non-empty Linked List
        LinkedList<String> b = new LinkedList<String>("Let's get it!!");
        b.remove("Let's get it!!");
        b.add("This is fucked up!");
        System.out.println("B: " + b);
        b.remove("This is fucked up!");
        System.out.println("B: " + b);

    }

}
