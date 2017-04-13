package skeleton;
/**
 *
 * @author Seth
 */
public class Restaurant {
    private String name;
    private String address;
    private String foodType;
    private int foodWaste;
    
    public Restaurant(String name){
        this.name = name;
    }
    
    public Restaurant(String name, String address, String foodType, int foodWaste){
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
    
    public String getFullInfo(){
        String fullInfo;
        fullInfo = "Restaurant Name: " + name + ", Address: " + address 
                + ", Food Type: " + foodType + ", Wasted Food: " + foodWaste + "lbs";
        return fullInfo;
    }
    
    
}
