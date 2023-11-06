public class Car extends Vehicle{
    int numberOfDoors;
    public Car(String make, String model, int year, int numberOfDoors){
        super(make,model,year);
        this.numberOfDoors=numberOfDoors;
    }
    public void displayInfo(){
        System.out.println("Car: "+getMake()+" "+getModel()+" "+getYear());
        System.out.println("Number of Doors:"+this.numberOfDoors);
        System.out.println();
    }
    
}
