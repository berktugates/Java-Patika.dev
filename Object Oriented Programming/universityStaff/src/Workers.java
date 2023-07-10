public abstract class Workers {
    private String nameSurname;
    private String mpno;
    private String eposta;

    public Workers(String nameSurname, String mpno, String eposta){
        this.nameSurname = nameSurname;
        this.mpno = mpno;
        this.eposta = eposta;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname){
        this.nameSurname = nameSurname;
    }

    public String getmpno(){
        return mpno;
    }

    public void setmpno(String mnpo){
        this.mpno = mpno;
    }

    public String getEposta(){
        return eposta;
    }

    public void setEposta(String eposta){
        this.eposta = eposta;
    }

    // Methods

    public void giris(){
        System.out.println(getNameSurname() + " kişisi üniversiteye giriş yapmıştır.");
    }
    public void cikis(){
        System.out.println(getNameSurname() + " kişisi üniversiteden çıkış yapmıştır.");
    }

    public void yemekhane(){
        System.out.println(getNameSurname() + " kişisi yemekhaneye giriş yapmıştır.");
    }
}
