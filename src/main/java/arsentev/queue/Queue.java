package arsentev.queue;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Queue<T> {

    private Node<T> head;
    private Node<T> tail;

    public void add(T value)
    {
        Node<T> node = new Node<T>(value);
        if (this.head==null){
            this.head = node;
        } else if (tail==null){
            this.tail = node;
            this.head.next = this.tail;
        }else {
            this.tail.next = node;
            this.tail = node;
        }

    }

    public T remove()
    {
        if (head == null){
            throw new IllegalArgumentException("queue is empty");
        }
        Node<T> element = this.head;
        this.head = this.head.next;
        element.next = null;
        return element.value;
    }

    private static final class Node<V> {
        V value;
        Node<V> next;

        public Node(V value) {
            this.value = value;
        }
    }

    private final class TraversalInner implements Iterator<T> {
        Queue.Node<T> el= Queue.this.head;

        public boolean hasNext() {
            return this.el!=null;
        }

        public T next() {
            if (!this.hasNext()){
                throw new NoSuchElementException("no element");
            }
            else {

            }

            return null;
        }

        public void remove() {

        }
    }






}
