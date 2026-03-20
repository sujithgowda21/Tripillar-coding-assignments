package Module11;

public class Maze {
    static void path(int i, int j, int n, int m, String p){
        if(i == n-1 && j == m-1){
            System.out.println(p);
            return;
        }

        if(i < n-1) path(i+1, j, n, m, p + "D");
        if(j < m-1) path(i, j+1, n, m, p + "R");
    }

    public static void main(String[] args) {
        path(0, 0, 3, 3, "");
    }

}
