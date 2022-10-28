public class RemoveDuplicate {  
//Represents the node of list.  
public class Node{  
int data;  
Node next;  
public Node(int data) {  
this.data = data;  
}  
}  
//Declaring head and tail pointer as null.  
public Node head = null;  
public Node tail = null;  
//This function will add the new node at the end of the list.  
public void add(int data){  
//Create new node  
Node newNode = new Node(data);  
//Checks if the list is empty.  
if(head == null) {  
 //If list is empty, both head and tail would point to new node.  
head = newNode;  
tail = newNode;  
newNode.next = head;  
}  
else {  
//tail will point to new node.  
tail.next = newNode;  
//New node will become new tail.  
tail = newNode;  
//Since, it is circular linked list tail will points to head.  
tail.next = head;  
}  
}  
//Removes duplicate from the list  
public void removeDuplicate() {  
//Current will point to head  
Node current = head, index = null, temp = null;  
if(head == null) {  
System.out.println("List is empty");  
}  
else {  
do{  
//Temp will point to previous node of index.  
temp = current;  
//Index will point to node next to current  
index = current.next;  
while(index != head) {  
//If current node is equal to index data  
if(current.data == index.data) {  
//Here, index node is pointing to the node which is duplicate of current node  
//Skips the duplicate node by pointing to next node  
temp.next = index.next;  
}  
else {  
//Temp will point to previous node of index.  
temp = index;  
}  
index= index.next;  
}  
current =current.next;  
}while(current.next != head);  
}  
}  
//Displays all the nodes in the list  
public void display() {  
Node current = head;  
if(head == null) {  
System.out.println("List is empty");  
}  
else {  
 do{  
//Prints each node by incrementing pointer.  
System.out.print(" "+ current.data);  
current = current.next;  
}while(current != head);  
System.out.println();  
}  
}  
public static void main(String[] args) {  
RemoveDuplicate cl = new RemoveDuplicate();  
//Adds data to the list  
cl.add(1);  
cl.add(2);  
cl.add(3);  
cl.add(2);  
cl.add(2);  
cl.add(4);  
System.out.println("Originals list: ");  
cl.display();  
//Removes duplicate nodes  
cl.removeDuplicate();  
System.out.println("List after removing duplicates: ");  
cl.display();  
}  
}  
