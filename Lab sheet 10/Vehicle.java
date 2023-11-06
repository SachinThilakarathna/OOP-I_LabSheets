abstract public class Vehicle{
    String make,model;
    int year;

    abstract public void displayInfo();
    
    public Vehicle(String make,String model,int year){
        this.make=make;
        this.model=model;
        this.year=year;
    }
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }

}