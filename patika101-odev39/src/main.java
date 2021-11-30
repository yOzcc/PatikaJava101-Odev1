public class main {
    public static void main(String[] args) {

        Course math = new Course("Math", "MAT101", "MAT");
        Course physics = new Course("Physics", "PHY101", "PHY");
        Course chemical = new Course("Chemical", "CHE101", "CHE");

        Teacher t1 = new Teacher("Mehmet Zeki Sarıkaya", "90550000000", "MAT");
        Teacher t2 = new Teacher("Mert Yıldırım", "90550000001", "PHY");
        Teacher t3 = new Teacher("Tahsin Er", "90550000002", "CHE");

        math.addTeacher(t1);
        physics.addTeacher(t2);
        chemical.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", math, physics, chemical);
        s1.addBulkExamNote(50, 60,20,70,40,60);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", math, physics, chemical);
        s2.addBulkExamNote(100, 100,50,75,40,60);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", math, physics, chemical);
        s3.addBulkExamNote(50,70,20,50,40,60);
        s3.isPass();

    }
}