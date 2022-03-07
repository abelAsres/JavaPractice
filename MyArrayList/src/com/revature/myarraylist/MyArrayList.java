package com.revature.myarraylist;

import java.sql.Array;
import java.util.Iterator;
import java.util.function.Consumer;

public class MyArrayList<T>{
    private T[] arrayOfValues;
    private int numOfElements;

    public MyArrayList(){
        arrayOfValues = (T[]) new Object[2];
        numOfElements = 0;
    }

    public MyArrayList(T... args){
        arrayOfValues = (T[]) new Object[args.length];
        for (int i =0; i < args.length;i++){
            arrayOfValues[i]=args[i];
        }
        numOfElements= args.length;
    }

    public void add(T element) {
        if (isFull()){
            System.out.println("The Arraylist is full");
            T[] tempArray = arrayOfValues;
            arrayOfValues = (T[]) new Object[this.numOfElements *2];

            for (int i = 0; i < tempArray.length; i++){
                arrayOfValues[i] = tempArray[i];
            }
        }

        arrayOfValues[numOfElements++] = element;

    }

    public T getElement(int idx){
        return arrayOfValues[idx];
    }

    public T[] getArrayOfValues() {
        return arrayOfValues;
    }

    public int size() {
        return arrayOfValues.length;
    }

    public boolean isFull() {
        return numOfElements == arrayOfValues.length && numOfElements >= 2;
    }

    public void setArrayOfValues(T[] arrayOfValues) {
        this.arrayOfValues = arrayOfValues;
    }

    public int getNumOfElements() {
        return numOfElements;
    }

    public void setNumOfElements(int numOfElements) {
        this.numOfElements = numOfElements;
    }
}
