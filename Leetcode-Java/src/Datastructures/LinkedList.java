package Datastructures;

/**
 * LinkedList
 */
public class LinkedList {

    //Main for testing linked list stuff
    public static void main(String[] args) {
        
    }

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data=data;
            next=null;
        }
    }
    public LinkedList insert(LinkedList list, int data){

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
        
}
    
