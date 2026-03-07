package Module3;

public class constructor {
    String name;
    int marks;

    constructor(String n, int m) {
        name = n;
        marks = m;
    }

    void details() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}
class display {
    public static void main(String[] args) {

        constructor s1 = new constructor("Sujith", 90);

        s1.details();
    }

}
