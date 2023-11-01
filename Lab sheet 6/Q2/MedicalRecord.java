public class MedicalRecord{
    private int recordNumber;
    private String diagnosis;

    public MedicalRecord(int recordNumber,String diagnosis){
        this.recordNumber=recordNumber;
        this.diagnosis=diagnosis;
    }
    public String toString(){
        return String.format("Record Number : %d\nDiagnosis : %s\n",recordNumber,diagnosis);
    }

}