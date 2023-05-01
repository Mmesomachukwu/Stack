package org.example;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<String> stringStack = new Stack<>();

        stringStack.push("Minerta");
        stringStack.push("Mayonnaise");
        stringStack.push("Magodo");
        stringStack.push("Iwaya");

        System.out.println(""+stringStack.isEmpty());

        ///to remove an element, we can use the pop() method
        String name = stringStack.pop();
        System.out.println(stringStack);
        System.out.println("The element removed is the last element added to the stack. Which is: "+name);
        stringStack.search("Iwaya");
    }
}