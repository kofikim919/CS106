package bollocks;

public class LinkedLists {

    public class LinkedList{

        Node head;
        private int size = 0;

        private class Node {
            private Object element;
            private Node nextNode;

            public Node(Object element){
                this.element = element;
                this.nextNode = null;   
            }
        }

        public void addNode (LinkedList list, Object element) {

            Node newnode = list.new Node(element);
            //check if the head is null (meaning the linkedlist is empty)
            //if it is, set the head to the new node
            if (list.head == null) {
                list.head = newnode;
                size++;
            //if head is not null, follow the chain of nodes until you reach the end (next node would be null)
            //and then make the new node the last node's next node
            } else {
                Node current = list.head;
                while (current.nextNode != null) {
                    current = current.nextNode;
                }
                current.nextNode = newnode;
                size++;
            }
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