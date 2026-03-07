package Module4;

public class Stringdiff {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        String s = "India ";
        for  (int i=0; i<100000; i++){
            s = s.concat(" WON");
        }
        long stopTime=System.currentTimeMillis();
        System.out.println(" Time Taken by s: "+(stopTime-startTime)+"ms");

        startTime=System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("India ");
        for (int i=0; i<100000; i++) {
            sb.append(" WON");
        }
        stopTime=System.currentTimeMillis();
        System.out.println(" Time Taken by sb: "+(stopTime-startTime)+"ms");

        startTime=System.currentTimeMillis();
        StringBuilder SB=new StringBuilder("India ");
        for (int i=0; i<100000; i++) {
            SB.append(" WON");
        }
        stopTime=System.currentTimeMillis();
        System.out.println(" Time Taken by SB: "+(stopTime-startTime)+"ms");
    }

}

