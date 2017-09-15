/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isreehari.collection.set;
import java.util.HashSet;
/**
 *
 * @author sinukoll
 */
public class HashSetDemo1 {
    public static void main(String[] args){
        
        // HashSet Constructors 
        // HashSet hSet = new HashSet();
        // HashSet hSet = new HashSet(int initialCapacity);
        // HashSet hSet = new HashSet(int initialCapacity, float loadFactor);
        // HashSet hSet = new HashSet(Collection c);
        
        HashSet hSet = new HashSet();        
        hSet.add("A");
        hSet.add("B");
        hSet.add("C");
        hSet.add("D");
        hSet.add("Z");
        hSet.add(1);
        hSet.add(10);
        hSet.add(null);
        System.out.println(hSet);
        System.out.println(hSet.add("Z"));
        
    }
    
}
