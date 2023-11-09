import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);

        System.out.println("access");
        System.out.println(l1.get(0));
        System.out.println(l1.get(1));
        System.out.println(l1.get(2));

        System.out.println("using for loop");
        for(int i=0;i<l1.size();i++) {
            System.out.println(l1.get(i));
        }

        System.out.println("direct access");
        System.out.println(l1);

        System.out.println("Adding element at random : ");
        l1.add(1,10);
        System.out.println(l1);

        System.out.println("modifying element : ");
        l1.set(1, 100);
        l1.set(2, 200);
        System.out.println(l1);

        System.out.println("removing an element at index i : ");
        l1.remove(1);
        System.out.println(l1);

        System.out.println("removing element by specifying its value : ");
        l1.remove(Integer.valueOf(200));
        System.out.println(l1);

        // System.out.println("if we dont specify any class in arraylist we can put anything inside l1 : ");
        // ArrayList l = new ArrayList();
        // l.add("fawzaan");
        // l.add(1);
        // l.add(true);
        // System.out.println(l);
    }
}