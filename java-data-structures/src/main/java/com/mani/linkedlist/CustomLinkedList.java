package com.mani.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class CustomLinkedList {

    //https://www.devglan.com/datastructure/linkedlist-implementation-java#/google_vignette

    private Node head ;

    public CustomLinkedList(){

    }

    public void insert(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
        }else{
            Node currentNode = head;
            while(currentNode.getNextNode()!=null){
                currentNode= currentNode.getNextNode();
            }
            currentNode.setNextNode(newNode);
        }
    }

    public void printList(){
        if(head !=null){
            Node currentNode = head;
            while(currentNode.getNextNode()!=null){
                currentNode= currentNode.getNextNode();
            }
            System.out.println(currentNode.getData());
        }
    }

    public void deleteNodeAt(int index){
        Node node =head;
        for(int i=0;i<=index-1;i++){
            node =node.getNextNode();
        }
        node.setNextNode(node.getNextNode().getNextNode());
    }

    public void reverse(){
        Node previous =null;
        Node current=head;
        Node next;
        while(current!=null){
            next = current.getNextNode();
            current.setNextNode(previous);
            previous=current;
            current=next;

        }
    }

    public void insertHead(int data){
        Node newNode = new Node(data);
        newNode.setNextNode(head);
        head = newNode;
    }

    public boolean checkloop(){
        boolean loopExists = false;
        Map<Node, Integer> map = new HashMap<>();
        Node tempNode = head;
        while (tempNode != null){
            if(map.get(tempNode) == null){
                map.put(tempNode, 1);
            }else {
                map.put(tempNode, 2);
                loopExists = true;
                break;
            }
            tempNode = tempNode.getNextNode();
        }
        map.forEach((k,v)->{
            System.out.println("k:"+k+ "v:"+v);
        });
        return loopExists;
    }

}
