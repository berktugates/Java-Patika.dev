public class LabAssistant extends Assistant{
    public LabAssistant(String nameSurname, String mpno, String eposta, String bolum, String unvan, String officeHour){
        super(nameSurname, mpno, eposta, bolum, unvan, officeHour);
    }

    // Methods

    public void lablaraGir(){
        System.out.println(getNameSurname() + " lab asistanı labaratuvar dersinde giriş yaptı.");
    }

    @Override // Override from Academician class
    public void derseGir(){
        System.out.println(getNameSurname() + " adlı labaratuvar asistanı derse giriş yaptı.");
    }

}
