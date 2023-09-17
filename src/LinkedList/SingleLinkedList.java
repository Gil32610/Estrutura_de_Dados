

package LinkedList;
import Node.*;

public class SingleLinkedList {

    private Node root;

    private int size;

    private int quantity;

    public SingleLinkedList(int size) {
        this.size = size;
    }

    public void insertNode(int value){
        if(root == null){
            root = new Node(value);
            this.quantity++;
        }
        else{
            Node current = root;
            Node lastNode = root.getNext();
            while(lastNode!= null){
                current = lastNode;
                lastNode=current.getNext();
            }
            current.setNext(new Node(value));
            quantity++;
        }
    }


    public void printLinkedList(){
        Node node = root;
        for (int i = 0; i < size ; i++) {
            System.out.println(node);
            node = node.getNext();
        }
    }
}
