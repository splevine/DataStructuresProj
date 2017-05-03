/* May 3rd, 2017
 * Data Structures Project - Draft 
 * Prof. Nizich
 *
 * Team: Seth Levine, Peter Flyntz, Anthony LoSchiavo
 *
 * Draft author: Seth
 */

package datastructuresproject;

import java.util.*;

public class Main {
    
    /* Enter in the average amount of food wasted at each restaurant for each day of the week
    * Output which day of the week is the best to pick up food
    */

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //CONSTRUCTOR for Restaurant(String name, String address, Double distance, String manager){
        
        Restaurant R1 = new Restaurant("Frank's Pizza & Pasta", "2 Whippet Ln, East Norwich, NY 11732", 6.9, "Frank Banks");
        Restaurant R2 = new Restaurant ("The Whole Enchilada", "35 Greenmeadow Ln, Huntington, NY 11743", 5.6, "Gabriel Rayes");
        Restaurant R3 = new Restaurant ("Grand Buffet", "90 Crestwood Blvd, Farmingdale, NY 11735", 8.1, "James Chong");

        //inputWaste() method is in Restaurant class - 
        //Creates an array of the amount of food wasted each weekday based off user input
        //For development and demo, waste data is hard coded
        
        //STACK - LIFO - used to load waste data for first restaurant
        Stack<Integer> myStack = new Stack<>();
        myStack.add(150);
        myStack.add(140);
        myStack.add(130);
        myStack.add(120);
        myStack.add(110);

        // RESTAURANT WASTE FOR EACH DAY PUT INTO ARRAY
        // createArray method is in Restaurant class       
        R1.createArray(myStack.pop(), myStack.pop(), myStack.pop(), myStack.pop(), myStack.pop());
        R2.createArray(105, 110, 100, 120, 110);
        R3.createArray(100, 102, 141, 103, 100);
        
        // QUEUE - FIFO - Used to print days of week in order
        Queue<String> myQ = new LinkedList<>();
        myQ.add("Monday");
        myQ.add("Tuesday");
        myQ.add("Wednesday");
        myQ.add("Thursday");
        myQ.add("Friday");
        //System.out.println("myQ: " + myQ);

        // PRINT OUT INPUT DAY BY DAY - CALCULATE TOTAL DAILY WASTE
        int sum;
        for (int j = 0; j < 5; j++ ){
            // Print day of week
            System.out.println("** " + myQ.poll() + " **");
            // Print daily waste for each restaurant
            System.out.println(R1.getName() + ": " + R1.waste[j] + " lbs" );
            System.out.println(R2.getName() + ": " + R2.waste[j] + " lbs" );
            System.out.println(R3.getName() + ": " + R3.waste[j] + " lbs" );
            // Calculate total waste and print
            sum = R1.waste[j] + R2.waste[j] + R3.waste[j];
            System.out.println("Daily Waste: " + sum + "\n");      
        }
        
        //FIND DAY WITH MOST WASTE
        //STARTS WITH MONDAY (INDEX = 0)
        int max = R1.waste[0] + R2.waste[0] + R3.waste[0];
        int val;
        int index = 0; 
        // CYCLES THROUGH WEEKDAYS
        for (int i=0; i <5; i++) {
            val = R1.waste[i] + R2.waste[i] + R3.waste[i];
            if (val > max) {
                //SAVES BOTH DAY OF WEEK (INDEX) AND VALUE
                index = i;
                max = val;
            }
        }
        
        //LINKED LIST - DAYS OF WEEK - USED TO IDENTIFY DAY INDEX
        LinkedList<String> dow = new LinkedList<>();
        dow.add("Monday");
        dow.add("Tuesday");
        dow.add("Wednesday");
        dow.add("Thursday");
        dow.add("Friday");        

        // OUTPUT - DAY OF WEEK WITH MOST FOOD WASTED
        // OUTPUT - AMOUNT OF FOOD WASTED
        System.out.println("************************");
        System.out.println(" *** Current Output ***");
        System.out.println("Day of the week: " + dow.get(index));  
        System.out.println("Food Wasted: " + max + " lbs");  
        System.out.println("************************");
     
        //OUTPUT - FULL INFO ON EACH RESTAURANT
        //OUTPUT - FOOD WASTE STATS - USES BUBBLE SORT TO FIND MAX AND MIN
        //printFullInfo is method in Restaurants Class
        R1.printFullInfo();
        R2.printFullInfo();
        R3.printFullInfo();     
        
    }
}


