/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isreehari.collection.set;

import java.util.Comparator;
import java.util.TreeSet;

/**
 *
 * @author sinukoll
 */
public class TreeSetMyComparatorDemo1 {
    
public static void main(String[] args){
        
        TreeSet treeSet = new TreeSet(new MyComparator());
        
        treeSet.add("A");
        treeSet.add("a");
        treeSet.add("b");
        treeSet.add("C");
        treeSet.add("Z");
        //treeSet.add(1); // Class Cast Exception Hetrogines elements are not allow
        //treeSet.add(null); // Null Pointer Expection  but allowed for first element. 
        
        System.out.println(treeSet);
        
        
    }    
}


class MyComparator implements Comparator{
 
  public int compare(Object obj1, Object obj2){
      
       String newString1 = obj1.toString();
       String newString2 = obj2.toString();
       return -newString1.compareTo(newString2);
    }

}
