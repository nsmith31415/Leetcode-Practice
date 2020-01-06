package Datastructures;

import Datastructures.LinkedList.Node;

/**
 * BinaryTree
 */
public class BinaryTree<E> {
    public class Node{
        E data;
        Node left;
        Node right;

        public Node(E data){
            this.data = data;
        }
    }

    Node head;
    public BinaryTree(E data){
        head = new Node(data);
        head.left=null;
        head.right=null;
    }
/*
          a
        /   \
       b     c
      / \   / \
*/

    public void insert(E data){
        Node nn = new Node(data);
        //is there a head
        if(head == null){
            head = nn;
        }
        else{
            Queue<Node> q = new Queue<Node>();
            q.queue(head);
            Node n=q.dequeue();
            boolean placed = false;
            while(!placed && n!=null){
                if(n.left==null){
                    n.left=nn;
                    placed=true;
                }
                else if(n.right==null){
                    n.right=nn;
                    placed=true;
                }
                else{
                    q.queue(n.left);
                    q.queue(n.right);
                }
            }
        }
    }
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<Integer>(0);
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.print();

    }

    public void print(){
        Queue<Node> q = new Queue<>();
        q.queue(head);
        Node n = q.dequeue();
        while(n!=null){
            System.out.print(n.data + " ");
            if(n.left!=null)
                q.queue(n.left);
            if(n.right!=null)
                q.queue(n.right);
            n=q.dequeue();
            System.out.println();
        }

    }
        
}
