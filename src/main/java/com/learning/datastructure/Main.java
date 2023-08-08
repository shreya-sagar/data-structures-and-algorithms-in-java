package com.learning.datastructure;

import com.learning.datastructure.LinkedList;

public class Main {

  public static void main(String[] args) {
    System.out.println("Hello world of data structures and algorithms in java!");

    LinkedList linkedList = new LinkedList(5);
    linkedList.append(8);
    linkedList.append(12);
    System.out.println("Removed last element " + linkedList.removeLast().value);
    linkedList.prepend(6);
    System.out.println("Removed first element " + linkedList.removeFirst().value);

    System.out.println("Head : " + linkedList.getHead().value);
    System.out.println("Tail : " + linkedList.getTail().value);
    System.out.println("Length : " + linkedList.getLength());
    linkedList.printList();
  }
}