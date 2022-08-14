package ss10_generic_stack_queue.codegym;

public class ReverseInteger {
    public static void StackOfInterger() {
        MyStack<Integer> stack = new MyStack<>();

        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println("Size of the stack: "+ stack.size());

        MyStack<Integer> reverseStack = new MyStack<>();

        System.out.print("Elements of the stack: ");
        while (stack.isEmpty()) {
            int temp = stack.pop();
            reverseStack.push(temp);
            System.out.printf(" %d", temp);
        }
        System.out.print("\nAfter reversing: ");
        reverseStack.paint();
    }

    public static void main(String[] args) {
        System.out.println("Stack of integers");
        StackOfInterger();
    }
}
