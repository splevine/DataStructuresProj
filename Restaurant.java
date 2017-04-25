package datastructuresproj;

import java.util.Scanner;

/**
 *
 * @author Seth
 */
public class Restaurant {
    Scanner sc = new Scanner(System.in);

    private String name;
    private String address;
    private String foodType;
    String manager;
    
    double distance;
    private int foodWaste;
    private int MonWaste;
    private int TuesWaste;
    private int WedsWaste;
    private int ThurWaste;
    private int FriWaste;    
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
    
    public Restaurant(String name, String address, String foodType){
        this.name = name;
        this.address = address;
        this.foodType = foodType;
        this.foodWaste = foodWaste;
    }
    public String getName(){
        return name;
    }
    
    public String getFoodType(){
        return foodType;
    }
    
    public String getAddress(){
        return address;
    }
    
    public int getFoodWaste(){
        return foodWaste;
    }
    
    public String getInfo(){
        String fullInfo;
        fullInfo = "Restaurant Name: " + name + ", Address: " + address 
                + ", Food Type: " + foodType + ", Wasted Food: " + foodWaste + "lbs";
        return fullInfo;
    }
    
    public String printInfo(){
        String printInfo;
        printInfo = "Restaurant: " + name + "\nAddress: " + address 
                + "\nFood Type: " + foodType + "\nWasted Food: **" + foodWaste + "** lbs";
        return printInfo;
    }
    
    public String printFullInfo(){
        String printFullInfo;
        printFullInfo = "Restaurant: " + name + "\nAddress: " + address 
                + "\nDistance: " + distance + "\nContact: " + manager +"\n";
        return printFullInfo;
    }
    
    public int[] createArray() {
        int[] waste = new int[5];
        waste[0] = MonWaste; 
        waste[1] = TuesWaste; 
        waste[2] = WedsWaste; 
        waste[3] = ThurWaste;
        waste[4] = FriWaste;
        return waste;
    }
    
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
    
}
