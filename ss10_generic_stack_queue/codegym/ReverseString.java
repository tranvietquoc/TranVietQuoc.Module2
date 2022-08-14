package ss10_generic_stack_queue.codegym;

import ss10_generic_stack_queue.codegym.stack.MyStack;

public class ReverseString {
    public static void StackOfString () {
        MyStack<String> stack = new MyStack<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println();
        MyStack<String> reverseStack = new MyStack<>();
        System.out.println("Size of the stack: " + stack.size());
        System.out.print("Elements of the stack: ");
        while (stack.isEmpty()) {
            String temp = stack.pop();
            reverseStack.push(temp);
            System.out.printf(" %s", temp);
        }
        System.out.print("\nAfter reversing: ");
        reverseStack.paint();
    }
    public static void main(String[] args) {
        System.out.println("Stack of Strings");
        StackOfString();
    }
}
