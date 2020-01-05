package Datastructures;

/**
 * LinkedList
 */
public class LinkedList<E> {

    //Main for testing linked list stuff
    public static void main(String[] args) {
        
    }

    Node head;

    class Node {
        E data;
        Node next;

        Node(E data) {
            this.data=data;
            next=null;
        }
    }
    public LinkedList<E> insert(LinkedList<E> list, E data){

        //creating new node
        Node newnode = new Node(data);

        //check if head is empty
        if(list.head==null){
            list.head = newnode;
        }
        //else traverse and add to end of list
        else{
            Node end = list.head;
                while(end.next !=null){
                    end =end.next;
                }
                end.next = newnode;
            }
        return list;
    }

    public void print(LinkedList<E> list){
        Node node = list.head;
        while(node !=null){
            System.out.println(node.data + " ");
            node = node.next;
        }
    }
        
}
    
