package bollocks;

public class ArrayStack<E> {

    private int size = 0;
    private E[] stack;

    public ArrayStack(int capacity) {
        stack = (E[]) new Object[capacity];
    }

    public void push(E element){
        if (size==stack.length) {
            throw new IllegalStateException("Stack is full");
        } else {
            stack[size++] = element;
        }
    }

    public E pop() {
        if (size == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        E element = stack[--size];
        stack[size] = null;
        return element;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public String printStack() {
        StringBuilder sb = new StringBuilder();
        sb.append("Stack: [");
        for (int i = 0; i < size; i++) {
            sb.append(stack[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
