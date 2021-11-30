public class Teacher {

    String name;
    String mpno;
    String branch;

    Teacher(String name, String branch, String mpno){
        this.name = name;
        this.branch = branch;
        this.mpno = mpno;
    }

    void print(){
        System.out.println("Name \t: " + this.name);
        System.out.println("Branch \t: " + this.branch);
        System.out.println("M.Phone\t: " + this.mpno);
    }
}
