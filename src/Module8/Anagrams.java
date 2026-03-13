package Module8;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String s1 = "SinglE";
        String s2 = "EngliS";

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if(Arrays.equals(a,b))
            System.out.println("The given string is Anagram");
        else
            System.out.println("The given string is Not Anagram");
    }
}
