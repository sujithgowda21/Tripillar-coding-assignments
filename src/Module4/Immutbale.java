package Module4;

public class Immutbale {
    public static void main(String[] args) {
        String s1="Sujith";
        s1.concat("gowda");

        System.out.println(s1);

        String s2 =s1.concat(" Gowda");
        System.out.println(s2);
    }
}
