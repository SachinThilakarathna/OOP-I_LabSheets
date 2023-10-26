public class Circle {
    public double radius;
    String color;

    Circle(){
        this.radius=1.0;
        this.color="red";
    }
    Circle(double r){
        this.radius=r;
        this.color="red";
    }
    Circle(String c){
        this.radius=1.0;
        this.color=c;
    }

    public void output(){
        System.out.println("Radius is :"+radius);
        System.out.println("Color is :"+color);
    }

    public static void main(String[] args) {
        Circle op=new Circle();
        Circle op1=new Circle(23.8d);
        Circle op2=new Circle("blue");
        op.output();
        System.out.println();
        op1.output();
        System.out.println();
        op2.output();
                

    }
}    
