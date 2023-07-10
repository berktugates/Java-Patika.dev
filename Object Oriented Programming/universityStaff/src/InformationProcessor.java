public class InformationProcessor extends Officer{
    private String dust;

    public InformationProcessor(String nameSurname, String mpno, String eposta, String department, String shift, String dust){
        super(nameSurname, mpno, eposta, department, shift);
        this.dust = dust;
    }

    public String getDust(){
        return dust;
    }
    public void setDust(String dust){
        this.dust = dust;
    }

    // Methods

    public void networkKurulum(){
        System.out.println(getNameSurname() + " adlı bilgi işlem çalışanı network kurulumu yaptı.");
    }

}
