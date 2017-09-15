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
public class TreeSetComparableComparatorDemo1 {
  public static void main(String[] args){
      Student newStudent1 = new Student(1,"Sreehari");
      Student newStudent2 = new Student(2,"Sai");
      Student newStudent3 = new Student(3,"Mani");
      Student newStudent4 = new Student(4,"Naveen");
      
      //TreeSet studentTreeSet = new TreeSet();
      TreeSet studentTreeSet = new TreeSet(new CustomComparator());
      
      studentTreeSet.add(newStudent1);
      studentTreeSet.add(newStudent2);
      studentTreeSet.add(newStudent3);
      studentTreeSet.add(newStudent4);
      
      System.out.println(studentTreeSet);
      
      
      
  }
}

class Student implements Comparable{
    public int studentId;
    public String studentName;
    
    public Student(int newStudentId, String newStudentName){        
        this.studentId = newStudentId;
        this.studentName = newStudentName;        
    }
    
    public String toString(){
        return this.studentName + " -- " + this.studentId;
    }
    
    public int compareTo(Object obj2){
        
        int student1Id = this.studentId;
        Student student2 = (Student) obj2;
        int student2Id = student2.studentId;
        
        if(student1Id > student2Id)
            return 1;
        else if(student1Id < student2Id)
            return -1;
        else
            return 0;
    }
}

class CustomComparator implements Comparator{
    
    public int compare(Object obj1, Object obj2){
        
        Student student1 = (Student)obj1;
        Student student2 = (Student)obj2;
        return student1.studentName.compareTo(student2.studentName);
    }
    
}
