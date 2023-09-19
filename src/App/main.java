package App;

import LinkedList.SingleLinkedList;
import Node.Node;

public class main {


    public static void main(String[] args) {
        Integer[] array = {7,4,3,8,9};
        SingleLinkedList list = new SingleLinkedList();
        for (int i = 0; i < array.length; i++) {
            list.insertNode(array[i]);
        }
        SingleLinkedList mult = multiply(6, list);
        list.printLinkedList();
        System.out.println("-".repeat(10));
        mult.printLinkedList();
    }


    public static SingleLinkedList multiply(Integer times, SingleLinkedList list){
        SingleLinkedList singly = new SingleLinkedList();
        Node current = list.getRoot();
        int mult = 0;
        int carryOne = 0;
        int sum = 0;
        while(current!=null || carryOne!=0){
            if(current!= null){
                mult = (current.getValue()*times);
                current= current.getNext();
            }
            sum = mult%10 + carryOne;
            carryOne = mult/10 + sum/10;
            singly.insertNode(sum%10);
            mult = 0;
        }

        return singly;
    }
}
