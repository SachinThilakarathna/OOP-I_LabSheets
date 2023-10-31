public class Books {
    private int bookNo;
    private String bookName;
    private Author books;

    public Books(int nNo,String bName,Author books){
        bookNo=nNo;
        bookName=bName;
        this.books=books;
    }

    public String toString(){
        return String.format("Book No : %d\nBook Name : %s\n%s",bookNo,bookName,books);
    }




    
}
