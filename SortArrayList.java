import java.util.ArrayList;
import java.util.*;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>();
        s.add("Aspires");
        s.add("to");
        s.add("be");
        s.add("a");
        s.add("java");
        s.add("expert");
        System.out.println("Original " + s);
        Collections.sort(s);
        Collections.sort(s, Collections.reverseOrder());
        System.out.println("Reverse " + s);
    }
}