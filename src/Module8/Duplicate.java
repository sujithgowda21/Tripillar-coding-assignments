package Module8;

public class Duplicate {
    public static void main(String[] args) {
        String s = "supercalifragilisticespialidocious";
        String result = "";

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);

            if(result.indexOf(c) == -1){
                result += c;
            }
        }

        System.out.println(result);
    }

}
