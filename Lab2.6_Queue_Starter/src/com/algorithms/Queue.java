package com.algorithms;

import java.util.Optional;

public class Queue<V> {
    // DblLinkedListNode is provided
    // create a private Node for "head"
    // create a private Node for "tail"
    private DblLinkedListNode<V> head;
    private DblLinkedListNode<V> tail;

    public Queue() {
        head = null;
        tail = null;
    }

    public void enqueue(V item) {
        // add an item to the queue
        // TODO-Lab2.6: Implement the logic below
        // pseudo code
        //    create new node from item, null previous and next
        DblLinkedListNode<V> node = new DblLinkedListNode<>(item, null, null);
        // if head is null:
        if(head == null) {
            // point head and tail at new node
            head = node;
        }
        //    else:
        else {
            //        set tail next to new node
            //        set new node's previous to tail
            //        set tail to new node
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail = node;
    }

    public V dequeue() {
        // get and remove an item from the queue
        // TODO-Lab2.6: Implement the logic below
        // pseudo code
        //    1. if head is null
        //          return null
        if(head == null){
            return null;
        }
        V value = null;
        //    2. node = the node head is pointing at
        value = head.getValue();
        //    3. head = head.next
        DblLinkedListNode<V> node = head;
        value = node.getValue();
        head = head.getNext();
        if(head != null){
            head.setPrevious(null);
        }
        //    4. if head is not null:
        //            set head previous to null
        //    5. return node.value
        return value;
    }

    public static void main(String[] args) {
        Queue<String> q = new Queue<>();
        q.enqueue("one");
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.enqueue("one");
        q.enqueue("two");
        q.enqueue("three");
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.enqueue("two");
        q.enqueue("three");
        System.out.println("2 values added to queue");
        System.out.println("Now try to remove both values");
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println("\nAll values removed, try to remove another");
        System.out.println(q.dequeue());
        System.out.println("\nQueue should be empty now, add a new item");
        q.enqueue("four");
        System.out.println("\nNow remove the one item");
        System.out.println(q.dequeue());
        System.out.println("\nAll items should be gone, try to remove one");
        System.out.println(q.dequeue());
    }
}
