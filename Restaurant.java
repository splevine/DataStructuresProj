
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
                System.out.println("Monday Waste: ");
            }
            if (i==1) {
                System.out.println("Tuesday Waste: ");
            }
            if (i==2) {
                System.out.println("Wednesday Waste: ");
            }
            if (i==3) {
                System.out.println("Thursday Waste: ");
            }       
            if (i==4) {
                System.out.println("Friday Waste: ");
            }                   
            this.waste[i] = sc.nextInt();
        }
    }
    
}

