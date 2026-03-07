package Module3;

public class privateencap {
    private String name;
    private int marks;

      public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setMarks(int m) {
        marks = m;
    }

    public int getMarks() {
        return marks;
    }

    public static void main(String[] args) {

        privateencap s1 = new privateencap();

        s1.setName("Sujith");
        s1.setMarks(88);

        System.out.println("Name: " + s1.getName());
        System.out.println("Marks: " + s1.getMarks());
    }
}
