public class VehicleInheritanceExample {
    public static void main(String[] args) {
        Car op=new Car("CHR",2002);
        Motorcycle op2=new Motorcycle("Yamaha", 2000);

        op.start();
        op.accelerate();
        op.honk();
        op.stop();
        System.out.println();

        op2.start();
        op2.accelerate();
        op2.wheelie();
        op2.stop();
        
    }
    
}
