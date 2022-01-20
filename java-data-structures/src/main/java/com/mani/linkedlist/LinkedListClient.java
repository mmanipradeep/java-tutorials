package com.mani.linkedlist;

import java.util.Scanner;

public class LinkedListClient {

    public static void main(String[] args) {
        CustomizedLinkedList<Integer> linkledList =new CustomizedLinkedList<>();
        Scanner scn = new Scanner(System.in);
        System.out.println( "Enter the elements ->");
        int n = scn.nextInt();
        System.out.println("Enter elemetn one by one ");
        while ((n--)>0){
            linkledList.addLast(scn.nextInt());
        }
        System.out.println(linkledList);
        System.out.println("The Size of linked list is="+linkledList.getSize());
    }
}
