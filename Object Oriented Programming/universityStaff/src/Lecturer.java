public class Lecturer  extends Academician{
    private String doorNumber;

    public Lecturer(String nameSurname, String mpno, String eposta, String bolum, String unvan, String doorNumber){
        super(nameSurname,mpno,eposta,bolum,unvan);
        this.doorNumber = doorNumber;
    }

    public String getDoorNumber(){
        return doorNumber;
    }
    public void setDoorNumber(String doorNumber){
        this.doorNumber = doorNumber;
    }

    // Methods
    public void senatoToplanti(){
        System.out.println(getNameSurname() + " adlı öğretim görevlisi senato toplantısına katılmıştır.");
    }

    public void sinavYap(){
        System.out.println(getNameSurname() + " sınavı başlatmıştır.");
    }
}
