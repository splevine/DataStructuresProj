package datastructuresproject;

import java.util.Scanner;

/**
 * 5/3/2017
 * @author Seth
 */
public class Restaurant {
    Scanner sc = new Scanner(System.in);

    String name;
    String address;
    String foodType;
    String manager;
    double distance;
    
    int[] waste = new int[5];    
    
    public Restaurant(String name){
        this.name = name;
    }
    
    public Restaurant(String name, String address, Double distance, String manager){
        this.name = name;
        this.address = address;
        this.distance = distance;
        this.manager = manager;
    }
    
    public String getName(){
        return name;
    }
    
    //DISPLAY RESTAURANT INFO WITH PROPER SPACING
    public String printInfo(){
        String printInfo;
        printInfo = "Restaurant: " + name + "\nAddress: " + address 
                + "\nDistance: " + distance + " miles" + "\nContact: " + manager +"\n";
        return printInfo;
    }
    
    //BUBBLESORT Algorithm, COMPARES AND SWAPS IF APPROPRIATE
    private static void bubbleSort(int[] intArray) {
        int n = intArray.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){                          
                if(intArray[j-1] > intArray[j]){
                    //swap the elements!
                    temp = intArray[j-1];
                    intArray[j-1] = intArray[j];
                    intArray[j] = temp;
                }                          
            }
        }  
    }
    
    // USES BUBBLE SORT TO FIND MAX AND MIN DAILY WASTE, ALSO PRINTS AVERAGE WEEKLY WASTE
    public String printFoodWasteStats(){
        String FoodWaste;
        int tot = 0;
        for (int i = 0; i < this.waste.length; i++){
            tot = tot + this.waste[i];
        }
        
        bubbleSort(this.waste);
        int min = this.waste[0];
        int max = this.waste[this.waste.length - 1];
        FoodWaste = ("Weekly Average: " + tot + "\nMinimum Daily Waste: " + min + "\nMaximum Daily Waste: " + max);
        return FoodWaste;  
    }
    
    // CREATES ARRAY FOR DAILY WASTE
    public int[] createArray(int MonWaste, int TuesWaste, int WedsWaste, int ThurWaste, int FriWaste) {  
        waste[0] = MonWaste; 
        waste[1] = TuesWaste; 
        waste[2] = WedsWaste; 
        waste[3] = ThurWaste;
        waste[4] = FriWaste;
        return waste;
    }
    
    // USES SCANNER TO INPUT DAILY WASTE, MONDAY TO FRIDAY
    public void inputWaste(){
    System.out.println("Please Enter the amount of food wasted each day at " + this.getName());
        for (int i = 0; i < 5; i++){
            if (i==0) {
                System.out.print("Monday Waste: ");
            }
            if (i==1) {
                System.out.print("Tuesday Waste: ");
            }
            if (i==2) {
                System.out.print("Wednesday Waste: ");
            }
            if (i==3) {
                System.out.print("Thursday Waste: ");
            }       
            if (i==4) {
                System.out.print("Friday Waste: ");
            }                   
            this.waste[i] = sc.nextInt();      
        }
    }
    
    // uses printInfo() and printFoodWasteStats()
    public void printFullInfo(){
        System.out.println("\n************************");        
        System.out.println(this.printInfo());
        System.out.println(this.printFoodWasteStats());
        System.out.println("************************");
    }
}
