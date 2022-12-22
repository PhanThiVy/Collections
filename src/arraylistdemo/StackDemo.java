/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistdemo;

import java.util.Stack;

/**
 *
 * @author phanthivy
 */
public class StackDemo {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("B");
        stack.push("A");
        stack.push("C");
        stack.push("D");
        //print stack
        System.out.println(stack);

        //
        stack.forEach(s -> {
            System.out.print(s + " ");
        });

        //empty()
        System.out.println();
        System.out.println("stack is empty: " + stack.empty());

        //get element at top
        System.out.println("Element at the top: " + stack.peek());

        //search
        System.out.println("Search position of element 'C': " + stack.search("C"));

        //pop
        int n = stack.size();
        for (int i = 0; i < n; i++) {
            System.out.print(stack.pop() + " ");
        }
    }
}
