package exam;

import org.json.JSONTokener;

public class Exam09 {
    public static void main(String[] args) {
        JSONTokener tokener = new JSONTokener(System.in);

        while (tokener.more()) {
            System.out.println(tokener.nextValue());
        }
    }
}
