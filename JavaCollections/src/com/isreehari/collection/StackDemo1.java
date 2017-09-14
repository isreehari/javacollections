/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isreehari.collection;
import java.util.Stack;
/**
 *
 * @author sinukoll
 */
public class StackDemo1 {
    public static void main(String[] args){
        
        //Stack Constructor
        // Stack newStack = new Stack();
        
        Stack newStack = new Stack();
        
        //Methods of Stack
        // Object push(Object obj);
        // Object pop(Object obj);
        // Object peak(Object obj);
        // int search(Object obj);
        // boolean isEmpty();
        
        newStack.push("A");
        newStack.push("B");
        newStack.push("C");
        System.out.println(newStack);
        System.out.println(newStack.isEmpty());
        System.out.println(newStack.peek());
        System.out.println(newStack.search("A"));
        System.out.println(newStack.search("Z"));
        System.out.println(newStack.pop());
        System.out.println(newStack);
        
        
        
    }
    
}
