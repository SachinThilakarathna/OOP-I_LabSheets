public class Motorcycle extends Vehicle {
    boolean hasFairing;
    public Motorcycle(String make, String model, int year, boolean hasFairing){
        super(make, model, year);
        this.hasFairing = hasFairing;
    }

    public void displayInfo(){

        System.out.println("Motorcycle:"+make+" "+model+" "+year);
        System.out.println("Has Fairing: "+hasFairing);
        System.out.println();

    }

    
}
