public class Invoice {
    String partNumber;
    String partDescription;
    int quantity;
    double price;

    public Invoice(){

    }
    public Invoice(String n){
        this.partNumber=n;
        this.partDescription="null";
        this.quantity=0;
        this.price=0.0;

    }

    public Invoice(String n,String d){
        this.partNumber=n;
        this.partDescription=d;
        this.quantity=0;
        this.price=0.0;

    }

    public Invoice(String n,String d,int q){
        this.partNumber=n;
        this.partDescription=d;
        this.quantity=q;
        this.price=0.0;        
    }

    public Invoice(String n,String d,int q,double p){
        this.partNumber=n;
        this.partDescription=d;
        this.quantity=q;
        this.price=p;  
    }

    public Invoice(Invoice n2){
        this.partNumber=n2.partNumber;
        this.partDescription=n2.partDescription;
        this.quantity=n2.quantity;
        this.price=n2.price;  
    }
    
    public void output(){
        System.out.println("Part Number is :"+partNumber);
        System.out.println("Part Description is :"+partDescription);
        System.out.println("Quantity is :"+quantity);
        System.out.println("Ptrice is :"+price);
    }


    public static void main(String[] args) {
        Invoice op=new Invoice();
        Invoice op1=new Invoice("2222");
        Invoice op2=new Invoice("2222","sdfsf");
        Invoice op3=new Invoice("2222","sdfsf",2);
        Invoice op4=new Invoice("2222","sdfsf",2,2000);
        Invoice op5=new Invoice(op3);

        op.output();
        System.out.println();
        op1.output();
        System.out.println();
        op2.output();
        System.out.println();
        op3.output();
        System.out.println();
        op4.output();
        System.out.println();
        op5.output();
    }
    
}
