package com.revature.main;

import com.revature.MyLinkedList.MyLinkedList;
import com.revature.myarraylist.MyArrayList;

public class Driver {
    public static void main(String[] args) {
        //Custom ArrayList
        MyArrayList<String> names = new MyArrayList<>();
        MyArrayList<Integer>numbers = new MyArrayList<Integer>(1,2,3,4,5,6);

        System.out.println("names Arraylist length is: "+names.getNumOfElements());
        System.out.println("numbers Arraylist length is: "+numbers.getNumOfElements());

        names.add("Abel");
        names.add("Asres");
        names.add("Selam");
        names.add("Teweldai");
        names.add("Ezra");//should create a new array
        names.add("Micah");

        for (int i = 0; i < names.getNumOfElements();i++){
            System.out.println(names.getElement(i));
        }

        for (int i = 0; i < numbers.getNumOfElements();i++){
            System.out.println(numbers.getElement(i));
        }

        //Custom LinkedList
        MyLinkedList<String> newNames=new MyLinkedList<String>();

        newNames.pushFront("Abel");
        newNames.pushFront("Asres");
        newNames.pushFront("Selam");
        newNames.pushFront("Teweldai");
        newNames.pushFront("Ezra");//should create a new array
        newNames.pushFront("Micah");


        int idx = newNames.inList("Selam");
        if(idx == -1){
            System.out.println("Not in List");
        }else{
            for (int i=0;i<=idx;i++){
                System.out.println("Hello "+newNames.get(i));
            }
        }

        for (int i=0;i< newNames.getNumberOfElements();i++){
            System.out.println("Hello "+newNames.get(i));
        }




    }
}
