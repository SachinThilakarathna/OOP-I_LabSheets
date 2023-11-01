public class Patient {
    private String name;
    private MedicalRecord medicalrecord;

    public Patient(String name,MedicalRecord medicalRecord){
        this.name=name;
        this.medicalrecord=medicalRecord;
    }

    public String toString(){
        return String.format("Patient Name : %s\n%s",name,medicalrecord);
    }
}
