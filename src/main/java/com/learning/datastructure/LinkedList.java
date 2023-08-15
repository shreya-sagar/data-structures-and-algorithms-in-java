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
    if (length == 0) {
      head = newNode;
      tail = newNode;
    } else {
      tail.next = newNode;
      tail = newNode;
    }
    length++;
  }

  public Node removeLast() {
    if (length == 0) {
      return null;
    }
    Node pre = head;
    Node temp = head;
    while (temp.next != null) {
      pre = temp;
      temp = temp.next;
    }
    tail = pre;
    tail.next = null;
    length--;
    if (length == 0) {
      head = null;
      tail = null;
    }
    return temp;
  }

  public void prepend(int value) {
    Node newNode = new Node(value);
    if (length == 0) {
      head = newNode;
      tail = newNode;
    } else {
      newNode.next = head;
      head = newNode;
    }
    length++;
  }

  public Node removeFirst() {
    if (length == 0) {
      return null;
    }
    Node temp = head;
    head = head.next;
    temp.next = null;
    length--;
    if (length == 0) {
      tail = null;
    }
    return temp;
  }

  public Node get(int index) {
    if (index < 0 | index >= length) {
      return null;
    }
    Node temp = head;
    for (int i = 0; i < index; i++) {
      temp = temp.next;
    }
    return temp;
  }

  public boolean set(int index, int value) {
    Node temp = get(index);
    if (temp != null) {
      temp.value = value;
      return true;
    }
    return false;
  }

  public boolean insert(int index, int value) {
    if (index < 0 || index > length) {
      return false;
    }
    if (index == 0) {
      prepend(value);
      return true;
    }
    if (index == length) {
      append(value);
      return true;
    }
    Node newNode = new Node(value);
    Node temp = get(index - 1);
    newNode.next = temp.next;
    temp.next = newNode;
    length++;
    return true;
  }

  public Node remove(int index) {
    if (index < 0 || index >= length) {
      return null;
    }
    if (index == 0) {
      return removeFirst();
    }
    if (index == length - 1) {
      return removeLast();
    }

    Node prev = get(index - 1);
    Node temp = prev.next;
    prev.next = temp.next;
    temp.next = null;
    length--;
    return temp;
  }

  public void reverse() {
    Node temp = head;
    head = tail;
    tail = temp;

    Node before = null;
    for (int i = 0; i < length; i++) {
      Node after = temp.next;
      temp.next = before;
      before = temp;
      temp = after;
    }
  }

  public Node findMiddleNode() {
    if(length == 0) return null;
    if(length == 1) return head;
    Node temp = head;
    if(length % 2 == 0) {
      for (int i = 1; i < length/2; i++) {

      }
    }
    return get(length / 2);
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
