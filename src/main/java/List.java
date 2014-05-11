/**
 * Created by Даша on 11.05.14.
 */
public class List<T> {

    private class Node<T>{

        private T data;
        private Node next;

        public Node(T data){
            this.data=data;
            this.next=null;
        }


        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
            this.next=null;
        }
    }

    private Node head;
    private Node current;
    private Node tail;

    public List(){
        this.head=null;
        this.current=null;
        this.tail=null;
    }

    public boolean endOfList(){
        return this.current==null;
    }

    public boolean isEmpty(){
        return this.head==null;
    }

    public void add(T data){
        Node node=new Node(data);
        if(this.isEmpty()){
            this.head=node;
            this.tail=node;
        } else {
            node.setNext(this.head);
            this.head=node;
        }
        this.current=this.head;
    }

}
