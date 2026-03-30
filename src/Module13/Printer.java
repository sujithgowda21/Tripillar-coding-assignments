package Module13;

import java.util.LinkedList;

import java.util.Queue;

public class Printer {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();

        q.add("Sapthagiri ");
        q.add("NPS ");
        q.add("University");

        while (!q.isEmpty()) {
            System.out.println("Printing: " + q.poll());
        }
    }
}

