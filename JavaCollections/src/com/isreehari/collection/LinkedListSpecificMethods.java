/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isreehari.collection;
import java.util.LinkedList;
/**
 *
 * @author sinukoll
 */
public class LinkedListSpecificMethods {
    
    public static void main(String[] args){
        
        
        // LinkedList constructors
        // LinkedList l = new LinkedList();
        // LinkedList l = new LinkedList(Collection c);
        
        LinkedList l = new LinkedList();
        
        l.add("A");
        l.add(1,"a");        
        System.out.println(l);
        
        // Specific methods of LinkedList Class
        
        l.addFirst("x");
        l.addLast("z");
        System.out.println(l.getFirst());
        System.out.println(l);
        System.out.println(l.getLast());        
        System.out.println(l);
        System.out.println(l.removeFirst());
        System.out.println(l);        
        System.out.println(l.removeLast());
        
        
        
        
        
    }
    
}
