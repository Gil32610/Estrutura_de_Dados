package App;
import LinkedList.SingleLinkedList;

public class main {


    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList(10);
        for (int i = 0; i < 10; i++) {
            list.insertNode(i);
        }
        list.printLinkedList();
        list.reverse();
        list.printLinkedList();

    }
}
