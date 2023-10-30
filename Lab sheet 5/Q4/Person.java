public class Person{
    private int age;
    private float weight; 
    private float height;

    public Person(int age,float weight,float height){
        setAge(age);
        setWeight(weight);
        setHeight(height);
    }

    public void setAge(int age){
        if(age!=0){
            this.age=age;
        }
        else{
            System.out.println("The age should not be null or empty ");
        }
        
    }
    public void setWeight(float weight){
        if(weight!=0.0f){
            this.weight=weight;
        }
        else{
            System.out.println("The weight should not be null or empty ");
        }
        
    }
    public void setHeight(float height){
        if(height!=0.0f){
            this.height=height;
        }
        else{
            System.out.println("The height should not be null or empty ");
        }
        
    }
    public int getAge(){
        return age;
    }
    public float getWeight(){
        return weight;
    }
    public float getHeight(){
        return height;
    }

    public void BMI(){
        float v=(this.weight/(height*height));

        if(v<16)
        System.out.println("Severely Underweight");
        else if(16.0f<v && v<18.4f)
        System.out.println("Underweight"); 
        else if(18.5f<v && 24.9f>v)  
        System.out.println("Normal");
        else if(25.0<v && v<29.9)
        System.out.println("Overweight");
        else if(30.0<v && 34.9>v)
        System.out.println("Moderately Obese");
        else if(35.0<v && 39.9>v)
        System.out.println("Severely Obese");
        else if(v>=40.0)
        System.out.println("Morbidly Obese");

    }

    public String toString(){
        return String.format("Age : %d\nWeight : %.2f\nHeight : %.2f\n",getAge(),getWeight(),getHeight());
    }
}