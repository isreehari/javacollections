/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isreehari.collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
/**
 *
 * @author sinukoll
 */
public class ArrayListDemo1 {
    public static void main(String[] agrs){
        
        // ArrayList constructors 
//        ArrayList newArrayList = new ArrayList();        
//        ArrayList newArrayList2 = new ArrayList(int intialCapacity);        
//        ArrayList newArrayList3 = new ArrayList(Collection c);        
        
        
        ArrayList newArrayList = new ArrayList();        
        
        newArrayList.add(1);
        newArrayList.add(3);       
        newArrayList.add("a");
        newArrayList.add("z");        
        newArrayList.add(3);
        newArrayList.add(3);
        
        System.out.println(newArrayList);
        newArrayList.add(null);        
        System.out.println(newArrayList);
        newArrayList.remove("a");           
        System.out.println(newArrayList);
        
        List l = Collections.synchronizedList(newArrayList);
        
        System.out.println(l);
        
        
    }
}
