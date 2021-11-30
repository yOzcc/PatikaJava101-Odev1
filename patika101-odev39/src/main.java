public class main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut hoca", "HIS", "905375653565");
        Teacher t2 = new Teacher("Mert Yildirim", "PHY","905556553040");
        Teacher t3 = new Teacher("Kulyutmaz","BIO", "905355428090");

        Course history = new Course("History", "101", "HIS");
        history.addTeacher(t1);

        Course physics = new Course("Physics","102","PHY");
        physics.addTeacher(t2);

        Course biology = new Course("Biology","103", "BIO");
        biology.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", "123", "4",history,physics,biology);
        s1.addBulkExamNote(100,100,50);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi","234","4",history,physics,biology);
        s2.addBulkExamNote(22,60,50);
        s2.isPass();
    }
}
