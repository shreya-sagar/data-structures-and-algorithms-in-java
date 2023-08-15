package com.learning.datastructure;

import com.learning.datastructure.LinkedList;

public class Main {

  public static void main(String[] args) {
    System.out.println("Hello world of data structures and algorithms in java!");

    LinkedList linkedList = new LinkedList(5);
    linkedList.append(8);
    linkedList.prepend(6);
    linkedList.printList();

    System.out.println("Removed last element " + linkedList.removeLast().value);
    System.out.println("Removed first element " + linkedList.removeFirst().value);

    System.out.println("Head : " + linkedList.getHead().value);
    System.out.println("Tail : " + linkedList.getTail().value);
    System.out.println("Length : " + linkedList.getLength());
    linkedList.printList();

    System.out.println("GET : " + linkedList.get(linkedList.getLength() - 1).value);
    System.out.println("INSERT : " + linkedList.insert(0, 101));
    linkedList.printList();

    System.out.println("SET : " + linkedList.set(linkedList.getLength() - 1, 201));
    linkedList.printList();
    System.out.println("APPEND");
    linkedList.append(222);
    linkedList.append(333);
    linkedList.append(444);
    linkedList.append(000);
    linkedList.append(555);
    linkedList.append(666);
    linkedList.printList();
    System.out.println("REMOVE : " + linkedList.remove(linkedList.getLength() - 1).value);
    linkedList.printList();
    linkedList.removeFirst();
    System.out.println("REVERSE");
    linkedList.reverse();
    linkedList.printList();
    System.out.println("MIDDLE NODE : "+linkedList.findMiddleNode().value);
  }
}