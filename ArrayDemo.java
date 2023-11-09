public class ArrayDemo {
    public static void main(String[] args) {
        int age[] = new int[3];
        age[0] = 1;
        age[1] = 2;
        age[2] = 3;
        // System.out.print(age[0]);
        // System.out.print(age[1]);
        // System.out.print(age[2]);
        for(int a: age) {
            System.out.println(a);
        }
        String[] name = {"fawzaan","will","master","java","in sha Allah"};
        System.out.print(" "+name[0]+" ");
        System.out.print(name[1]+" ");
        System.out.print(name[2]+" ");
        System.out.print(name[3]+" ");
        System.out.print(name[4]+" ");

        int[] roll;
        roll = new int[3];
        roll[0]=1609;
        roll[1]=2273;
        roll[2]=3167;
        System.out.print(roll[0]);
        System.out.print(roll[1]);
        System.out.print(roll[2]);
    }
}