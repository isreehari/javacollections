/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isreehari.collection.queue;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author sinukoll
 */
public class QueueDemo1 {
    public static void main(String[] args){
        Queue q = new LinkedList();
        q.offer("A");
        q.offer("B");
        q.offer("C");
        q.offer("D");
        
        System.out.println(q);
        System.out.println(q.remove());
        
    }
    
}
