public class Student {
    String name,stuNo;
    int classes;
    Course math;
    Course physics;
    Course chemical;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course math,Course physics,Course chemical) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.math = math;
        this.physics = physics;
        this.chemical = chemical;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(double math, double verbalMath, double physics, double verbalPhysics, double chemical, double verbalChemical) {

        if (math >= 0 && math <= 100 && verbalMath >=0 && verbalMath <=100) {
            this.math.note = (math*(0.80)+verbalMath*(0.20));
        }

        if (physics >= 0 && physics <= 100 && verbalPhysics >=0 && verbalPhysics <=100) {
            this.physics.note = (physics*(0.80)+verbalPhysics*(0.20));
        }

        if (chemical >= 0 && chemical <= 100 && verbalChemical >=0 && verbalChemical <=100) {
            this.chemical.note = (chemical*(0.80)+verbalChemical*(0.20));
        }

    }

    public void isPass() {
        if (this.math.note == 0 || this.physics.note == 0 || this.chemical.note == 0) {
            System.out.println("Notes not fully entered");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Average : " + this.avarage);
            if (this.isPass) {
                System.out.println("student is successful. ");
            } else {
                System.out.println("The student is not successful.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (this.physics.note + this.chemical.note + this.math.note) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Student : " + this.name);
        System.out.println("Math Note : " + this.math.note);
        System.out.println("Physics Note : " + this.physics.note);
        System.out.println("Chemical Note : " + this.chemical.note);
    }

}