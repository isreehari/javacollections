/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isreehari.collection.list;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

/**
 *
 * @author sinukoll
 */
public class ArrayListDemo2 {
    public static void main(String[] args){
        ArrayList a1 = new ArrayList();
        LinkedList a2 = new LinkedList();
        
        System.out.println( a1 instanceof Serializable);
        System.out.println( a1 instanceof Cloneable);
        System.out.println( a1 instanceof RandomAccess);
        System.out.println( a2 instanceof Serializable);
        System.out.println( a2 instanceof Cloneable);
        System.out.println( a2 instanceof RandomAccess);
        
        
    }
    
}
