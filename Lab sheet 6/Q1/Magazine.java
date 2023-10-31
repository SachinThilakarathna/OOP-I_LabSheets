public class Magazine {
    private int magazineNo;
    String magazineName;
    Author magazine;

    public Magazine(int mNo,String mName,Author magazine){
        magazineNo=mNo;
        magazineName=mName;
        this.magazine=magazine;
    }

    public String toString(){
        return String.format("Magazine No : %d\nMagazine Name : %s\n%s",magazineNo,magazineName,magazine);
    }
    

    
    
}
