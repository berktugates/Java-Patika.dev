
public class StudentInformationSystem {
    public static void main(String[] args) {
        // added teacher objects
        Teacher mathT = new Teacher("Ali Kuscu","MATH","111111");
        Teacher bioT = new Teacher("Aziz Sancar","BIO","222222");
        Teacher phyT = new Teacher("Aycan Yurtsever","PHY","333333");

        // added course objects
        Course math = new Course("Mathematics","MATH","101");
        Course bio = new Course("Biology","BIO","102");
        Course phy = new Course("Physics","PHY","101");

        // teachers were appointed to the courses.
        math.addTeacher(mathT);
        math.printTeacher();
        bio.addTeacher(bioT);
        bio.printTeacher();
        phy.addTeacher(phyT);
        phy.printTeacher();

        // added student object and methods

        Student student1 = new Student("Berke","4373","11-A",math,bio,phy);
        student1.addBulkExamNote(70,60,55,45,90,100);
        student1.printNote();
        student1.calcAverage();
        student1.isPass();
    }
}