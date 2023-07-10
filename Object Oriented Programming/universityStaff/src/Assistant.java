public class Assistant  extends Academician{
    private String officeHour;

    public Assistant (String nameSurname, String mpno, String eposta, String bolum, String unvan, String officeHour){
        super(nameSurname,mpno,eposta,bolum,unvan);
        this.officeHour = officeHour;
    }

    public String getOfficeHour(){
        return officeHour;
    }
    public void setOfficeHour(String officeHour){
        this.officeHour = officeHour;
    }

    // Methods
    public  void quizYap(){
        System.out.println(getNameSurname() + " adlı asistan quiz yapmaya başlamıştır.");
    }
}
