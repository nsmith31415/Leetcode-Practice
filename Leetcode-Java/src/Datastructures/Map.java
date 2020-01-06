package Datastructures;

/**
 * Map
 */
public class Map<K,V> {
    /**
     * Node<K,V>
     */
    public class Node{
        K key;
        V value;
        Node next;

        public Node(K key, V value){
            this.key=key;
            this.value=value;
            next=null;
        }
        
    }
    Node head;

    public void add(K key, V value){
        if(head==null){
            head = new Node(key,value);
        }
        else{
            Node n = head;
            while(n.next!=null){
                n=n.next;
            }
            n.next=new Node(key,value);
        }
        
    }

    public V find(K key) {
        Node n = head;
        while(n.next!=null){
            if(n.key==key){
                return n.value;
            }
            n=n.next;
        }
        return null;
    }
    
}