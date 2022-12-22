/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistdemo;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author phanthivy
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> li = new LinkedList<>();
        li.add(2);
        li.add(5);
        li.add(4);
        li.add(11);
        li.add(3);
        List<Integer> li2 = new LinkedList<>();
        li.add(6);
        li.add(9);
        li.add(8);
        
        li.addAll(li2);
        System.out.println("LinkedList: ");
        for (Integer l : li) {
            System.out.print(l+ " ");
        }
        
        //add first pos
        li.addFirst(0);
        System.out.println("");
        System.out.println("After add '0' at first position: ");
        for (Integer l : li) {
            System.out.print(l+ " ");
        }
        
        //add last pos
        li.addLast(0);
        System.out.println("");
        System.out.println("After add '0' at last position: ");
        for (Integer l : li) {
            System.out.print(l+ " ");
        }
        
        
        
    }
}
