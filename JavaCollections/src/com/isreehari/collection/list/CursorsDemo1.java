/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isreehari.collection.list;
import java.util.ArrayList;
import java.util.Vector;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
/**
 *
 * @author sinukoll
 */
public class CursorsDemo1 {
    
    public static void main(String[] args){
        
        ArrayList arrayList = new ArrayList();        
        arrayList.add("A");
        arrayList.add("C");
        arrayList.add("B");
        
        Vector vectorList = new Vector();        
        vectorList.addElement("A");
        vectorList.addElement("C");
        vectorList.addElement("B");
        
        // 3 Cursosrs of Java
        // Enumerator
            // public boolean hasMoreElements
            // public Object nextElement
        // Iterator
            // public boolean hasNext()
            // public Object next()
            // public void remove()
        // ListIterator
            // public boolean hasNext()
            // public object next()
            // public int nextIndex()
            // public boolean hasPrevious()
            // public Object previous
            // public int previousIndex()
            // public void remove()
            // public void set(Object newObj)
            // public void add(Object newObj)
            
            
        
        Enumeration emtr = vectorList.elements();        
        while(emtr.hasMoreElements())
            System.out.println(emtr.nextElement());
        
        
        Iterator itr1 = vectorList.iterator();        
        while(itr1.hasNext())
            System.out.println(itr1.next());
        
        Iterator itr2 = arrayList.iterator();        
        while(itr2.hasNext()){
            if((itr2.next()).equals("A"))
                itr2.remove();
            else
                System.out.println(itr2.next());
        }
        
        ListIterator litr1 = arrayList.listIterator();
        
        while(litr1.hasNext()){
            if((litr1.next()).equals("A"))
                litr1.set("Z");
            else
                System.out.println(litr1.next());
        }
        
        litr1.add("L");
        
        System.out.println(arrayList);
        
        
        
        
        
        
    }
    
    
}
