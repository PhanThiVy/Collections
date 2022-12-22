/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistdemo;

import java.util.Vector;

/**
 *
 * @author phanthivy
 */
public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.addElement(2);
        v.addElement(4);
        v.addElement(5);
        v.addElement(8);
        v.addElement(5);
        v.insertElementAt(6,1);
        System.out.println("Vector: "+ v);

        System.out.println("capacity: "+ v.capacity());

        System.out.println("hashcode: "+ v.hashCode() );

        v.removeElement(5);
        v.remove((Integer) 5);
        System.out.println("after remove 5: "+ v);
    }
}
