package Module4;

public class StudentVariable {
    static String college = "NPS  College";
    int usn;
    String name;

    StudentVariable(int i, String n) {
       usn = i;
       name = n;
    }
    static void changeCollege() {
        college = "Sapthagiri College";
    }

    void display() {
        System.out.println(usn + " " + name + " " + college);
    }

    public static void main(String args[]) {
        StudentVariable.changeCollege();
        StudentVariable s1 = new StudentVariable(113, "Sujith");
        StudentVariable s2 = new StudentVariable(6106, "Darshan");
        s1.display();
        s2.display();
    }
}
