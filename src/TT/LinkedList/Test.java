/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TT.LinkedList;

/**
 *
 * @author User
 */
public class Test {
    public static void main(String[] args) {
        LinkedListImpl linkedList = new LinkedListImpl();
        LinkedListImpl.Node head = linkedList.new Node();
        head.setData(1);
        head.setNext(null);
        
        LinkedListImpl.Node second = linkedList.new Node();
        second.setData(2);
        second.setNext(null);
        LinkedListImpl.Node third = linkedList.new Node();
        third.setData(3);
        third.setNext(null);
        head.setNext(second.getNext());
        second.setNext(third.getNext());
        int data = head.getData();
        
        LinkedListImpl.Node p = head;
        while(p!=null ){
            p.setData(p.getData());
            p.setNext(p.getNext());
            System.out.println(data+" ->");
        }
    }
}
