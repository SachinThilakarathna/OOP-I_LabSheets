public class Author {
    private String fistName;
    private String lastName;
    private String email;
    
    public Author(String fn,String ln,String em){
        this.fistName=fn;
        this.lastName=ln;
        this.email=em;
    }

    public String toString(){
        return String.format("Author Name : %s %s\nEmail : %s\n",fistName,lastName,email);
    }
    
}
