/* April 30th, 2017
 * Data Structures Project - Draft 
 * Prof. Nizich
 *
 * Team: Seth Levine, Peter Flyntz, Anthony LoSchiavo
 *
 * Draft author: Seth
 */

package datastructuresproj;

import java.util.*;

public class Main {
    
    /* Enter in the average amount of food wasted at each restaurant for each day of the week
    * Output which day of the week is the best to pick up food
    * To do: Find volunteers that can work that day
    */

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        
        //Constructor for Restaurant(String name, String address, Double distance, String manager){

        Restaurant R1 = new Restaurant("Frank's Pizza & Pasta", "2 Whippet Ln, East Norwich, NY 11732", 6.9, "Frank Banks");
        Restaurant R2 = new Restaurant ("The Whole Enchilada", "35 Greenmeadow Ln, Huntington, NY 11743", 5.6, "Gabriel Rayes");
        Restaurant R3 = new Restaurant ("The Grand Buffet", "90 Crestwood Blvd, Farmingdale, NY 11735", 8.1, "James Chong");

        //inputWaste() method is in Restaurant class - creates an array of the amount of food wasted each weekday
        //System.out.println("*******");
        //System.out.println("Final Product can have input method, for testing waste data is hard coded");
        
        R1.createArray(10, 20, 30, 40, 50);
        R2.createArray(50, 30, 40, 20, 10);
        R3.createArray(100, 101, 102, 103, 104);
        System.out.println(R1.waste[1]);  

        
        // Queue
        Queue<String> myQ = new LinkedList<>();
        myQ.add("Monday");
        myQ.add("Tuesday");
        myQ.add("Wednesday");
        myQ.add("Thursday");
        myQ.add("Friday");
        System.out.println("myQ: " + myQ);

        int sum;
        for (int j = 0; j < 5; j++ ){
            System.out.println("** " + myQ.poll() + " **");
            System.out.println(R1.getName() + ": " + R1.waste[j] + " lbs" );
            System.out.println(R2.getName() + ": " + R2.waste[j] + " lbs" );
            System.out.println(R3.getName() + ": " + R3.waste[j] + " lbs" );
            sum = R1.waste[j] + R2.waste[j] + R3.waste[j];
            System.out.println("Daily Waste: " + sum);      
        }
        
        //find day with most waste
        int max = R1.waste[0] + R2.waste[0] + R3.waste[0];
        int val;
        int index = 0;
        for (int i=0; i <5; i++) {
            val = R1.waste[i] + R2.waste[i] + R3.waste[i];
            if (val > max) {
                index = i;
                max = val;
            }
        }
        
        //dow = days of week
        LinkedList<String> dow = new LinkedList<String>();
        dow.add("Monday");
        dow.add("Tuesday");
        dow.add("Wednesday");
        dow.add("Thursday");
        dow.add("Friday");        

        
        System.out.println("************************");
        System.out.println(" *** Current Output ***");
        System.out.println("Day of the week: " + dow.get(index));  
        System.out.println("Food Wasted: " + max + " lbs");  
        
        
        
        //System.out.println(R1.printFullInfo());
        //System.out.println(R2.printFullInfo());
        //System.out.println(R3.printFullInfo());
        

        
    }
}

