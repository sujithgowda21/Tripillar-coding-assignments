package Module10;

public class ReverseString {
    public static void main(String[] args) {
        String str = "KARNATAKA";
        String[] words = str.split(" ");

        for(String word : words){
            String rev = "";
            for(int i = word.length()-1; i >= 0; i--){
                rev += word.charAt(i);
            }
            System.out.print(rev + " ");
        }
    }
}
