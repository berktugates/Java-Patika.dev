public class SecurityGuard extends Officer{
    private String document;

    public SecurityGuard(String nameSurname, String mpno, String eposta, String department, String shift, String document){
        super(nameSurname, mpno, eposta, department, shift);
        this.document = document;
    }

    public String getDocument(){
        return document;
    }
    public void setDocument(String document){
        this.document = document;
    }

    // Methods
    public void nobet(String hour){
        System.out.println(getNameSurname() + " adlı güvenlik görevlisi " + hour + " saatinde nöbete başladı.");
    }


}
