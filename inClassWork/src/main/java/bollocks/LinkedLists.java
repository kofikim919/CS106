package bollocks;

public class LinkedLists {

    public class LinkedList{

        Node head;
        Node tail;
        private int size = 0;

        private class Node {
            private Object element;
            private Node nextNode;
            private Node prevNode;

            public Node(Object element){
                this.element = element;
                this.nextNode = null;   
                this.prevNode = null;
            }
        }

        public void addNode (LinkedList list, Object element) {

            Node newnode = list.new Node(element);
            //check if the head is null (meaning the linkedlist is empty)
            //if it is, set the head to the new node
            //also set tail to new node
            if (list.head == null) {
                list.head = newnode;
                list.tail = newnode;
                size++;
            //if head is not null, go straight to the tail, and make its next node the new node
            //then make the tail point to the new node
            } else {
                Node current = list.tail;
                current.nextNode = newnode;
                newnode.prevNode = current;
                list.tail = newnode;
                size++;
            }
        }

        public void nodeAfter (LinkedList list, Object element, Node afterNode) {

            Node newNode = list.new Node(element);
            if (afterNode.nextNode == null) {
                afterNode.nextNode = newNode;
                newNode.prevNode = afterNode;
                list.tail = newNode;
            } else {
                newNode.nextNode = afterNode.nextNode;
                newNode.prevNode = afterNode;
                afterNode.nextNode.prevNode = newNode;
                afterNode.nextNode = newNode;
            }
            list.size++;
        }

        // lets us add an element at a desired index
        public void newNodeIndexed (LinkedList list, Object element, int position) {

            Node newnode = list.new Node(element);
            //if we want it at the start we make it the head and make the old head the next node
            if (position==0) {
                newnode.nextNode = list.head;
                list.head = newnode;
            //if we want it in the middle or end, we need to find the correct position
            } else {
                Node current = list.head;
                for (int i = 0; i < position - 1; i++) {
                    current = current.nextNode;
                }
                newnode.nextNode = current.nextNode;
                current.nextNode = newnode;
            }
            list.size++;
        }

        public void removeNode (int index){

            if (index<0 || index >= size) {
                throw new IndexOutOfBoundsException("Invalid index");
            }

            if (index == 0) {
                head = head.nextNode;
            } else {

                Node current = head;
                for (int i = 0; i < index-1; i++) {
                    current = current.nextNode;
                }
                current.nextNode = current.nextNode.nextNode;
            }
            size--;
        }

        public String printList() {

            StringBuilder sb = new StringBuilder();
            Node current = head;
            while (current != null) {
                sb.append(current.element);
                if (current.nextNode != null) {
                    sb.append(" -> ");
                }
                current = current.nextNode;
            }
            return sb.toString();

        }

        public String getNodeInfo(int index) {
            Node current = head;
            //go follow the chain of nodes until you reach the desired index
            for (int i = 0; i < index; i++) {
                current = current.nextNode;
            }
            return "Node element: " + current.element + ", Next node: " + (current.nextNode != null ? current.nextNode.element : "null");
        }

    }

}