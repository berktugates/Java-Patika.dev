public class Student {
    Course math;
    Course bio;
    Course phy;
    String name;
    String stuNo;
    String cls;
    double avg;
    boolean isPass;

    Student(String name, String stuNo, String cls, Course math, Course bio, Course phy){
        this.name = name;
        this.stuNo = stuNo;
        this.cls = cls;
        this.math = math;
        this.bio = bio;
        this.phy = phy;
        this.avg = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int mathNote, int mathVerbal, int bioNote, int bioVerbal,int phyNote, int phyVerbal){
        if(mathNote >= 0 && mathNote <= 100){
            this.math.note = mathNote;
        }
        if(mathVerbal>=0 && mathVerbal<=100){
            this.math.verbal = mathVerbal;
        }
        if(bioNote>=0 && bioNote<=100){
            this.bio.note = bioNote;
        }
        if(bioVerbal>=0 && bioVerbal<=100){
            this.bio.verbal = bioVerbal;
        }
        if(phyNote>=0 && phyNote<=100){
            this.phy.note = phyNote;
        }
        if(phyVerbal>=0 && phyVerbal<=100){
            this.phy.verbal = phyVerbal;
        }
    }

    void printNote(){
        System.out.println("Mathematics Grade: " + this.math.note);
        System.out.println("Mathematics Verbal Grade: " + this.math.verbal);
        System.out.println("Biology Grade: " + this.bio.note);
        System.out.println("Biology Verbal Grade: " + this.bio.verbal);
        System.out.println("Physics Grade: " + this.phy.note);
        System.out.println("Physics Verbal Grade: " + this.phy.verbal);
    }

    void calcAverage(){
        int mathAvg = (80 * this.math.note)/100 + (20 * this.math.verbal)/100;
        int bioAvg = (80 * this.bio.note)/100 + (20 * this.bio.verbal)/100;
        int phyAvg = (80 * this.phy.note)/100 + (20 * this.phy.verbal)/100;

        avg = (mathAvg + bioAvg + phyAvg) / 3.0;
        System.out.println("Average: " + this.avg);
    }

    void isPass(){
        if(avg>=50){
            System.out.println("Congratulations! You passed the class.");
        }
        else{
            System.out.println("Unfortunately! You failed the class.");
        }
    }

}
