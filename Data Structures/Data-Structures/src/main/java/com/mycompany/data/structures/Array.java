/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.data.structures;

/**
 *
 * @author Chase Staples
 * Array Notes:
 * Lookup = O(1)
 * Insert = O(n)
 * Delete = O(n)
 * Arrays are static in size
 */
public class Array {
    private int[] items;
    private int count;
    
    public Array(int length){
        items = new int[length];
        
    }
    
    //Print statement for array
    public void print(){
        for(int i = 0; i < count; i++){
            System.out.println(items[i]);
        }
    }
    
    public void insert(int item){
    //If the array is full, resize it
        if(items.length == count){
            //Create a new array(twice the size)
            int[] newItems = new int[count * 2];
            
            //Copy all the existing items
            for(int i = 0; i < count; i++){
                newItems[i] = items[i];
            }
            
            //Set items to this new array
            items = newItems;
        }
        
    //Add the new item at the end
        items[count++] = item;
    }
    
    public void removeAt(int index){
        //Validate the index
        if(index < 0 || index >= count){
            throw new IllegalArgumentException();
        }
        
        /**Shift the items to the left
         * 1 <- 2
         * 2 <- 3
         */
        for(int i = 0; i < count; i++){
            items[i] = items[i + 1];
        }
        count--;
    
    }
    
    public int indexOf(int item){
        //If we find it, return index
        //Otherwise, return -1
        for(int i = 0; i < count; i++){
            if(items[i] == item){
                //Best case: O(1)
                //Worst Case: O(n)
                return i;
            }
        }
        return -1;
    }
    
    
    
}

