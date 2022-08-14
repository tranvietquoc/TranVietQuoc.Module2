package ss10_generic_stack_queue.codegym.stack;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyStack<T> {
    public LinkedList<T> stack;

    public MyStack() {
        stack = new LinkedList<>();
    }

    public void push(T element) {
        stack.addFirst(element);
    }

    public T pop() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public T peek() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.peek();
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return false;
        }
        return true;
    }

    public void paint() {
        stack.forEach((e)->{
            System.out.print(e + " ");
        });
    }
}
