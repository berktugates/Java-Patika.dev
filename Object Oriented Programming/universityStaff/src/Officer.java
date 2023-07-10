public abstract class Officer  extends Workers{
    private String department;
    private String shift;

    public Officer(String nameSurname, String mpno, String eposta, String department, String shift){
        super(nameSurname, mpno, eposta);
        this.department = department;
        this.shift = shift;
    }

    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public String getShift(){
        return shift;
    }
    public void setShift(String shift){
        this.shift = shift;
    }

    // Methods
        public void calis(){
        System.out.println(getNameSurname() + " memuru çalışmaya başladı.");
    }
}
