public abstract class Academician extends Workers{
    private String bolum;
    private String unvan;

    public Academician(String nameSurname, String mpno, String ePosta,String bolum,String unvan){
        super(nameSurname,mpno,ePosta);
        this.bolum = bolum;
        this.unvan = unvan;
    }

    public String getBolum(){
        return bolum;
    }

    public void setBolum(String bolum){
        this.bolum = bolum;
    }

    public String getUnvan(){
        return unvan;
    }

    public void setUnvan(String unvan){
        this.unvan = unvan;
    }

    // Methods
    public void derseGir(){
        System.out.println(getNameSurname() + " adlı akademisyen derse giriş yaptı.");
    }
}
