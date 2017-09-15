/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isreehari.map;
import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/**
 *
 * @author sinukoll
 */
public class HashMapDemo1 {
    public static void main(String[] agrs){
        HashMap map = new HashMap();
        
        map.put("Sreehari", 700);
        map.put("Mani", 800);
        map.put("Naveen", 200);
        map.put("Sai", 500);
        System.out.println(map);        
        // Replacing the existing value with new value 
        System.out.println(map.put("Sreehari", 1000));
        
        Set s = map.keySet();
        System.out.println(s);
        
        Collection c = map.values();
        System.out.println(c);
        
        Set s1 = map.entrySet();
        System.out.println(s1);
        
        Iterator itr = s1.iterator();
        while(itr.hasNext()){
            Map.Entry m1 = (Map.Entry)itr.next();
            System.out.println(m1.getKey() + " .........." +m1.getValue());
            if(m1.getKey().equals("Sreehari")){
                m1.setValue(10000);
            }
        }
        
        
    }
    
}
