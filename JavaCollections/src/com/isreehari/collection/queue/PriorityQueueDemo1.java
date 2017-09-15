/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isreehari.collection.queue;
import java.util.PriorityQueue;
import java.util.Comparator;
/**
 *
 * @author sinukoll
 */
public class PriorityQueueDemo1 {
    public static void main(String[] args){
        
        PriorityQueue q = new PriorityQueue(10, new CustomComparator());       
        // PriorityQueue q = new PriorityQueue();       
        
        q.offer("B");        
        q.offer("C");
        q.offer("A");        
        System.out.println(q);    
        System.out.println(q.poll());    
        System.out.println(q.poll());    
        System.out.println(q);    
        
    }
}

class CustomComparator implements Comparator{
    public int compare(Object obj1, Object obj2){        
        return obj1.toString().compareTo(obj2.toString());
    }
}