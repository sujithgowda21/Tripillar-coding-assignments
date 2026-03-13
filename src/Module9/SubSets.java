package Module9;

public class SubSets {
    static void subset(String s,String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }

        subset(s.substring(1),ans+s.charAt(0));
        subset(s.substring(1),ans);
    }

    public static void main(String[] args) {
        subset("abcd","");
    }
}
