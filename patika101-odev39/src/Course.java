public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    double note;
    double verbalPhysics;
    double verbalChemical;
    double verbalMath;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.verbalChemical = 0;
        this.verbalMath = 0;
        this.verbalPhysics = 0;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("Transaction successful");
        } else {
            System.out.println(t.name + " Academician cannot teach this course.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " Academician of the course : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " No Academician has been assigned to the course.");
        }
    }
}


