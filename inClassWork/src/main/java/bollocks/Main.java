package bollocks;

public class Main {
    public static void main(String[] args) {

        LinkedLists.LinkedList list = new LinkedLists().new LinkedList();
        list.addNode(list, 4);
        list.addNode(list, "hello");
        list.addNode(list, 3.278);
        System.out.println(list.printList());
        System.out.println(list.getNodeInfo(1));
    }

}