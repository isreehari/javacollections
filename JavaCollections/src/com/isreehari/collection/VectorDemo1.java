/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isreehari.collection;
import java.util.Vector;
/**
 *
 * @author sinukoll
 */
public class VectorDemo1 {
    public static void main(String[] args){
        
        // Vector Constructors
        // Vector v = new Vector();
        // Vector v = new Vector(int initialCapacity);
        // Vector v = new Vector(int initialCapacity, int incrementalCapacity);
        // Vector v = new Vector(Collection c);
        
        
        Vector v = new Vector();
        
        System.out.println(v.capacity());
        v.add("a");
        v.add(1,"A");
        v.addElement("A");
        
        for(int i=0; i < 7; i++)
            v.addElement(i);
        System.out.println(v.capacity());
        v.addElement("X");
        System.out.println(v.capacity());
        
        
        System.out.println(v);
    }
    
}
