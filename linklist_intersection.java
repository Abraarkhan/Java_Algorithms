// This is a program to find the intersection two linked lists

public class LinkedList{
 
    private Node head;
 
    private static class Node {
        private int value;
        private Node next;
 
        Node(int value) {
            this.value = value;
 
        }
    }
 
    public void addToTheLast(Node node) {
 
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
 
            temp.next = node;
        }
    }
 
    public Node findIntersectionNode(Node list1, Node list2) {
        int lengthOfList1 = 0;
        int lengthOfList2 = 0;
        Node temp1=list1, temp2=list2;
        if (temp1 == null || temp2 == null)
            return null;
 
        // Find the length of both linked list
        while(temp1 != null){
            lengthOfList1++;
            temp1 = temp1.next;
        }
        while(temp2 !=null){
            lengthOfList2++;
            temp2 = temp2.next;
        }
 
        int difference = 0;
        Node ptr1=list1;
        Node ptr2=list2;
 
        // Find bigger linked list and iterate upto the different between two linked list.
        if(lengthOfList1 > lengthOfList2){
            difference = lengthOfList1-lengthOfList2;
            int i=0;
            while(i<difference){
                ptr1 = ptr1.next;
                i++;
            }
        }else{
            difference = lengthOfList2-lengthOfList1;
            int i=0;
            while(i<difference){
                ptr2 = ptr2.next;
                i++;
            }
        }
 
        // Iterate over both linked list and find the common node
        while(ptr1 != null && ptr2 != null){
            if(ptr1 == ptr2){
                return ptr1;
            }
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
 
        return null;
    }
 
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        // Creating a linked list
        Node head1=new Node(5);
        list1.addToTheLast(head1);
        list1.addToTheLast(new Node(6));
        Node node = new Node(7);
        list1.addToTheLast(node);
        list1.addToTheLast(new Node(1));
        list1.addToTheLast(new Node(2));
 
        LinkedList list2 = new LinkedList();
        Node head2=new Node(4);
        list2.addToTheLast(head2);
        list2.addToTheLast(node);
 
        Node findIntersectionNode = list1.findIntersectionNode(head1, head2);
        if(findIntersectionNode==null)
        {
            System.out.println("Two linked lists do not intersect!!");
        }
        else
        {
            System.out.println("Intersecting node: "+findIntersectionNode.value);
        }
    }
 
}
 
