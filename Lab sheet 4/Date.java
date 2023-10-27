public class Date {

    int month,day,year;

    public Date(){
        this.month=0;
        this.day=0;
        this.year=0;

    }

    public Date(int m,int d,int y){
        this.month=m;
        this.day=d;
        this.year=y;

    }
    public void display(){
        System.out.printf("%02d/%02d/%04d",month,day,year);   
    }


    public static void main(String args[]){
        Date op=new Date();
        Date op1=new Date(2,1,2003);

        op.display();
        System.out.println();
        op1.display();
        System.out.println();
    }
    
}
