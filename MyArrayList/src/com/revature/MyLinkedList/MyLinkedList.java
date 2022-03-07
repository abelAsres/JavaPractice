package com.revature.MyLinkedList;

public class MyLinkedList <T>{

    public Node front;
    public Node back;
    public int numberOfElements;

    public class Node{
        public T data;
        Node next;
        Node prev;

        Node(){}

        Node (T data, Node next,Node prev){
            this.data=data;
            this.next=next;
            this.prev=prev;
        }
    }

    public MyLinkedList(){
        front = new Node();
        back = new Node();
        front.next=back;
        back.prev=front;
    }

    public void pushFront(T data){
            Node newNode = new Node(data,front.next,front);
            front.next = newNode;
            numberOfElements++;
    }

    public void pushBack(T data){
        Node newNode = new Node(data,back,back.prev);
        back.prev = newNode;
        numberOfElements++;
    }

    public int inList(T data){
        Node getNode=front.next;
        int count = 0;
        while (getNode != back || getNode.data != data){
            if(getNode.data == data){
                return count;
            }
            count++;
            getNode = getNode.next;
        }
        return -1;
    }


    public T get(int idx){
        Node getNode=front.next;
        for (int i=0;i<idx;i++){
            getNode=getNode.next;
        }
        return getNode.data;
    }

    //LIFO
    public void popFront(){
        if (isEmpty()){
            System.out.println("The List is empty");
        }else{
            Node removeNode = front.next;
            front.next = removeNode.next;
            removeNode =null;
            numberOfElements--;
        }
    }
    //FIFO
    public void popBack(){
        if (isEmpty()){
            System.out.println("The List is empty");
        }else{
            Node removeNode = back.prev;
            back.prev = removeNode.prev;
            removeNode =null;
            numberOfElements--;
        }
    }

    public int getNumberOfElements(){
        return numberOfElements;
    }

    public boolean isEmpty(){
        return numberOfElements == 0;
    }

}
