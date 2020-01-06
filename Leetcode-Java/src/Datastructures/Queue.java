package Datastructures;

/**
 * Queue
 */
public class Queue<E> extends LinkedList<E> {
    public void queue(E data){
        if(head==null){
            head = new Node(data);
        }
        else{
            Node n = head;
            while(n.next!=null){
                n=n.next;
            }
            Node nn = new Node(data);
            n.next = nn;
        }
    }

    //   a->b->c->d
    //   b->c->d
    public E dequeue(){
        if(head!=null){
            E d = head.data;
            Node temp = head.next;
            head = temp;
            return d;
        }
        else{
            return null;
        }
        
    }

    public static void main(String[] args) {
        Queue<Integer> test = new Queue<Integer>();
        test.queue(1);
        test.queue(3);
        test.queue(5);
        test.queue(2);

        System.out.println(test.dequeue());
        System.out.println(test.dequeue());
        System.out.println(test.dequeue());
        System.out.println(test.dequeue());
        System.out.println(test.dequeue());
    }
}