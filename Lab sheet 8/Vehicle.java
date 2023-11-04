public class Vehicle {
    String brand;
    int year;

    public Vehicle(String brand,int year){
        this.brand=brand;
        this.year=year;
    }
    
    public String getBrand(){
        return brand;
    }
    public int getYear(){
        return year;
    }
    public void start(){
        System.out.println("Starting the " + getYear() + " " + getBrand() + " vehicle.");
    }
    public void stop(){
        System.out.println("Stopping the " + getYear() + " " + getBrand() + " vehicle."); 
    }
    public void accelerate(){
        System.out.println("Accelerating the " + getYear() + " " + getBrand() + " vehicle.");
    }

    
}