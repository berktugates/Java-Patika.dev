public class Course {
    Teacher teacher;
    String name;
    String prefix;
    String code;
    int note;
    int verbal;

    Course(String name, String prefix, String code){
        this.name = name;
        this.prefix = prefix;
        this.code = code;
        this.note = 0;
        this.verbal = 0;
    }

    void addTeacher(Teacher teacher){
        if(this.prefix.equals(teacher.branch)){
            this.teacher = teacher;
        }
        else{
            System.out.println("Hoca ilgili dersin hocası olmadığı için eklenemedi.");
        }
    }

    void printTeacher(){
        System.out.println("Name: " + teacher.name);
        System.out.println("Branch: " + teacher.branch);
        System.out.println("No: " + teacher.mpno);
    }

}
