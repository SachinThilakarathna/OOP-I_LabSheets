public class Time{
    int hour,minute,second;

    Time(){
       this.hour=0;
       this.minute=0;
       this.second=0;
    }

    Time(int h)
    {
       this.hour=h;
       this.minute=0;
       this.second=0;
    }

    public Time(int h, int m) {
       this.hour=h;
       this.minute=m;
       this.second=0;
    }

    public Time(int h, int m, int s) {
       this.hour=h;
       this.minute=m;
       this.second=s;
    }

    Time(Time aa){
       this.hour=aa.hour;
       this.minute=aa.minute;
       this.second=aa.second;
    }


    public void output()
    {
        System.out.println(+hour+"."+minute+"."+second);
    }

    public static void main(String[] args) {
        Time oop=new Time();
        Time oop2=new Time(20);
        Time oop3=new Time(20,30);
        Time oop4=new Time(20,30,40);
        Time oop5=new Time(oop4);

        System.out.print("Time 1: ");oop.output();
        System.out.print("Time 2: "); oop2.output();
        System.out.print("Time 3: ");oop3.output();
        System.out.print("Time 4: "); oop4.output();
        System.out.print("Time 5 (from Time 4): ");oop5.output();
        
    }
}