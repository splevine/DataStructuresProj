package skeleton;
/** April 6th, 2017
 * Data Structures Project - rough draft
 * Prof. Nizich
 * Inclusion of Data Structures through Queues
 *
 * @Team
 * Seth Levine, Peter Flyntz, Anthony LoSchiavo
 * 
 */

import java.util.*;

// Incorporate all necessary data structures
// Array, LinkedList, Stack, Queue
// Binary Tree, Binary Search, Bubble Sort
// We will probably want to create some other classes

public class Skeleton {
    public static void main(String[] args) {
        // This is just dummy code for now
        // Array of Strings
        String[] myArray = { "Restaurant 1", "Restaurant 2", "Holder 3" };
        System.out.println("myArray: " + myArray);
        System.out.println("Any ideas why it's printing that?");
        //myArray is printing a memory address on my system for some reason
        
        // Arraylist - this isn't on requirements, but we can use it if we want
        ArrayList obj = new ArrayList();
        obj.add("Holder 1");
        obj.add("Holder 2");
        System.out.println("ArrayList: " + obj);
        
        // LinkedList
        LinkedList<String> myLinkedList = new LinkedList<>();
        myLinkedList.add("Location 1");
        myLinkedList.add("Location 2");
        myLinkedList.add("Location 3");
        System.out.println("myLinkedList: " + myLinkedList);
        
        // Stack
        Stack myStack = new Stack();
        myStack.push("Stack 1");
        myStack.push("Stack 2");
        System.out.println("myStack: " + myStack);
       
        // Queue
        Queue<String> myQ = new LinkedList<String>();
        myQ.add("Queue 1");
        myQ.add("Queue 2");
        myQ.add("Queue 3");
        System.out.println("myQ: " + myQ);
        
        //binary tree
        //binary search
        //bubble sort
       
        
    }
    
}
