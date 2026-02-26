package bollocks;

public class Main {
    public static void main(String[] args) {

        ArrayStack<Object> stack = new ArrayStack<>(5);
        stack.push(4);
        stack.push("hello");
        stack.push(3.278);
        stack.push("world");
        stack.push("balls");
        System.out.println(stack.printStack());
        System.out.println(stack.pop());
        stack.push("new");
        System.out.println(stack.printStack());

    }

}