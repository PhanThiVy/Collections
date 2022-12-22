/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistdemo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author phanthivy
 */
public class ArrayListDemo {

    /**
     * @param args the command line arguments
     */
    public void cloneList(ArrayList<String> list){
        List<String> copyList= new ArrayList<>();
        copyList= (List<String>) list.clone();
        for (int i = 0; i < copyList.size(); i++) {
            System.out.print(copyList.get(i)+ " ");
        }
    }
    public void addAllList(List<String> list){
        //create the second list
        List<String> list2 = new ArrayList<>();
        list2.add("F");
        list2.add("B");
        list2.add("C");
        list2.add("H");
        list.addAll(list2);
        for (String l : list) {
            System.out.print(l+ " ");
        }
    }
    public static void main(String[] args) {
        ArrayListDemo arrayListDemo = new ArrayListDemo();
        //create a new list
        List<String> list = new ArrayList<>();
        //add element
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("A");
        list.add("H");
        
        //addAll()
        System.out.println("ADDALL---------------------------");
        arrayListDemo.addAllList(list);
        
        //clone
        System.out.println("");
        System.out.println("CLONE----------------------------");
        arrayListDemo.cloneList((ArrayList<String>) list);
        
        //
        
        
        
       
        
        
    }
    
}
