package Q2;

public class Students {
    private int id;
    private String name;
    private char gender;
    private String subjectName;
    private float marks;



    public Students(String n,int i,char g,String s,float m){
        setName(n);
        setId(i);
        setGender(g);
        setSubjectName(s);
        setMarks(m);
    }


    public void setName(String name){
        this.name=name;
    }

    public void setId(int id){
        this.id=id;
    }

    public void setGender(char gender){
        this.gender=gender;
    }

    public void setSubjectName(String subjectName){
        this.subjectName=subjectName;
    }

    public void setMarks(float marks){
        this.marks=(marks>=0 && marks<=100)? marks:0;  
    }



    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public char getGender(){
        return gender;
    }
    public String getSubjectName(){
        return subjectName;
    }
    public float getMarks(){
        return marks;
    }
  

    public String toString(){
        return String.format("Name : %s\nId : %d\nGender :%c\nSubject Name : %s\nMarks :%.2f\n ",getName(),getId(),getGender(),getSubjectName(),getMarks());

    }

}
