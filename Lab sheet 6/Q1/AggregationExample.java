public class AggregationExample {
    public static void main(String[] args) {
        Author op=new Author("Amila", "Perera", "amila@gmail.com");
        Author op1=new Author("Bhagya", "Perera", "bhagya@gmail.com");
       
        Magazine op2=new Magazine(13, "Kanda male", op1);
        Books op3=new Books(12,"harrypotter",op);
       
        
        System.out.println(op2);
        System.out.println();
        System.out.println(op3);
       
        

    }
    
}
