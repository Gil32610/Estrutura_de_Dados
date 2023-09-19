

package LinkedList;
import Node.*;

public class SingleLinkedList {

    private Node root;



    private int quantity;

    public Node getRoot(){
        return root;
    }

    public void insertNode(int value){
        if(root == null){
            root = new Node(value);
            this.quantity++;
        }
        else{

                Node current = root;
                Node lastNode = root.getNext();
                while (lastNode != null) {
                    current = lastNode;
                    lastNode = current.getNext();
                }
                current.setNext(new Node(value));
                quantity++;

        }
    }


    public void printLinkedList(){
        Node node = root;
      while(node!=null){
          System.out.println(node);
          node = node.getNext();
      }


    }

    public void reverse(){
        Node current = root;
        Node next = root.getNext();
        Node last = next.getNext();
        while(true){
            next.setNext(current);
            current=next;
            next= last;
            if(next== null){
                break;
            }
            last = next.getNext();
        }
        root.setNext(null);
        root = current;
    }

    public Integer[] toArray(){
        Node node = root;
        int size = 0;
        while(node!= null){
            size++;
        }
        node = root;
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = node.getValue();
            node = node.getNext();
        }
        return array;
    }
}
