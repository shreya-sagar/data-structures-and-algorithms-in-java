package com.learning.datastructure;

public class LinkedList {
  private Node head;
  private Node tail;
  private int length;

  public LinkedList(int value) {
    Node newNode = new Node(value);
    this.head = newNode;
    this.tail = newNode;
    this.length = 1;
  }

  public Node getHead() {
    return head;
  }

  public Node getTail() {
    return tail;
  }
  
  public int getLength() {
    return length;
  }

  public void printList() {
    if (length == 0) {
      System.out.println("Empty Linked List");
    } else {
      Node temp = head;
      while (temp != null) {
        System.out.println(temp.value);
        temp = temp.next;
      }
    }
  }

  public void append(int value) {
    Node newNode = new Node(value);
    if(length == 0) {
      head = newNode;
      tail = newNode;
    } else {
      tail.next = newNode;
      tail = newNode;
    }
    length++;
  }

  public Node removeLast() {
    if(length == 0) return null;
    Node pre = head;
    Node temp = head;
    while(temp.next != null) {
      pre = temp;
      temp = temp.next;
    }
    tail = pre;
    tail.next = null;
    length--;
    if(length == 0) {
      head = null;
      tail = null;
    }
    return temp;
  }

  public void prepend(int value) {
    Node newNode = new Node(value);
    if(length == 0) {
      head = newNode;
      tail = newNode;
    } else {
      newNode.next = head;
      head = newNode;
    }
    length++;
  }

  public Node removeFirst() {
    if(length == 0) return null;
    Node temp = head;
    head = head.next;
    temp.next = null;
    length--;
    if(length == 0) tail = null;
    return temp;
  }

  public class Node {
    int value;
    Node next;

    Node(int value) {
      this.value = value;
      this.next = null;
    }
  }
}
