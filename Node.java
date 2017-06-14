/**
 * Created by axelntwari on 6/8/17.
 */
public class Node<T> {

    private T data;
    private Node next;

    public Node(T data){
        this.data = data;
        this.next = null;
    }

    public T getData(){
        return data;
    }

    public void setData(T newData){
        data = newData;
    }

    public Node getNext(){
        return next;
    }

    public void setNext(Node newNode){
        next =newNode;
    }

    public String toString(){
        return data + "";
    }

}
