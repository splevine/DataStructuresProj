package skeleton;
/** April 13th, 2017
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

public class Skeleton1 {
    public static void main(String[] args) {
        // Skeleton Code for now
        
        // Array of Strings
        String[] myArray = { "Restaurant 1", "Restaurant 2", "Restaurant 3" };
        System.out.println("myArray: ");
        for (int i=0; i < myArray.length; i++){ //arrays use array.length for 'size'
        System.out.println(myArray[i] + " "); //array[index] to access array elements
        }
        
        // Arraylist - this isn't on requirements, but we can use it if we want
        ArrayList obj = new ArrayList();
        obj.add("Holder 1");
        obj.add("Holder 2");
        System.out.println("ArrayList: " + obj);
        
        ArrayList<Integer> vals = new ArrayList<>();
        vals.add(10);
        vals.add(15);
        vals.add(20);
        vals.add(25);
        System.out.println("Vals: " + vals);
        int sum = 0;
        for (int i = 0; i < vals.size(); i++){ //arrayList use obj.size() for 'length'
            sum = sum + vals.get(i); //arrayList use obj.get to access elements
        }    
        
        System.out.println("Sum of Vals: " + sum);
        
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
        myQ.add("Monday");
        myQ.add("Tuesday");
        myQ.add("Wednesday");
        myQ.add("Thursday");
        myQ.add("Friday");
        System.out.println("myQ: " + myQ);
        
        //
        //TreeSet<String> ts = new TreeSet<String>();
        
        //ts.add("C");
        //ts.add("A");
        //ts.add("B");
        //ts.add("E");
        //ts.add("F");
        //ts.add("D");
        
        //System.out.println("myTree: " + ts);

        //binary tree
        //binary search
        //bubble sort
       
        Restaurant Pizza = new Restaurant("Pizza", "20 Any Street", "Italian", 50);
        System.out.println (Pizza.getFullInfo());

        
    }
    
}
