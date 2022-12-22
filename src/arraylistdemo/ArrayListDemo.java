/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistdemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

/**
 *
 * @author phanthivy
 */
public class ArrayListDemo {

    /**
     * @param args the command line arguments
     */
    public void cloneList(ArrayList<String> list) {
        List<String> copyList = new ArrayList<>();
        copyList = (List<String>) list.clone();
        for (int i = 0; i < copyList.size(); i++) {
            System.out.print(copyList.get(i) + " ");
        }
    }

    public void addAllList(List<String> list) {
        //create the second list
        List<String> list2 = new ArrayList<>();
        list2.add("F");
        list2.add("B");
        list2.add("C");
        list2.add("H");
        list.addAll(list2);
        for (String l : list) {
            System.out.print(l + " ");
        }
    }

    public void getValue(List<String> list) {
        System.out.println("Get value at index 4: " + list.get(4));

        System.out.println("the first position of value 'H': " + list.indexOf("H"));

        System.out.println("the last positon of value 'C': " + list.lastIndexOf("C"));
    }

    public void setValue(List<String> list) {
        list.set(2, "R");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }

    public void sortList(List<String> list) {
        Collections.sort(list);
        ListIterator<String> li = list.listIterator(list.size());
        while (li.hasPrevious()) {
            System.out.print(li.previous() + " ");
        }
    }

    public void removeE(List<String> list) {
        System.out.println("List before remove: ");
        Iterator<String> it = list.iterator();
        it.forEachRemaining(s -> System.out.print(s + " "));

        list.remove(3);
        System.out.println("");
        System.out.println("List after remove index 3: ");
        for (String list1 : list) {
            System.out.print(list1 + " ");
        }

        list.remove("H");
        System.out.println("");
        System.out.println("List after remove 'H': ");
        for (String list1 : list) {
            System.out.print(list1 + " ");
        }
        List<String> list2 = new ArrayList<>();
        list2.add("F");
        list2.add("B");
        list.removeAll(list2);
        System.out.println("");
        System.out.println("List after removeAll: ");
        for (String list1 : list) {
            System.out.print(list1 + " ");
        }
        list.removeIf(s -> s.equals("D"));
        System.out.println("");
        System.out.println("List after remove element equals 'D': ");
        for (String list1 : list) {
            System.out.print(list1 + " ");
        }
    }

    public void containE(List<String> list) {
        System.out.println("List contain 'A': " + list.contains("A"));

        List<String> list2 = new ArrayList<>();
        list2.add("H");
        list2.add("E");

        System.out.println("List contain list (including F B) : " + list.containsAll(list2));

    }

    public void toArrayMethod(List<String> list) {
        String[] a2 = list.toArray(new String[list.size()]);
        System.out.println("Array:");
        for (String a : a2) {
            System.out.print(a+" ");
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

        //get value
        System.out.println("");
        System.out.println("GET------------------------------");
        arrayListDemo.getValue(list);

        //set value
        System.out.println("SET------------------------------");
        arrayListDemo.setValue(list);

        //sort
        System.out.println("");
        System.out.println("SORT-----------------------------");
        arrayListDemo.sortList(list);

        //remove
        System.out.println("");
        System.out.println("REMOVE---------------------------");
        arrayListDemo.removeE(list);

        //contain
        System.out.println("");
        System.out.println("CONTAIN--------------------------");
        arrayListDemo.containE(list);
        
        //toarray
        arrayListDemo.toArrayMethod(list);

    }

}
