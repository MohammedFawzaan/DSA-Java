public class MultiArrayDemo {
    public static void main(String[] args) {
        int[][] age = new int[4][3];

        age[0][0] = 1;
        age[0][1] = 2;
        age[0][2] = 3;

        age[1][0] = 4;
        age[1][1] = 5;
        age[1][2] = 6;

        age[2][0] = 7;
        age[2][1] = 8;
        age[2][2] = 9;
        
        age[3][0] = 10;
        age[3][1] = 11;
        age[3][2] = 12;

        System.out.println(age[2][2]);

        String[][] name = {{"hello","i"},{"am","fawzaan"}};
        System.out.print(name[0][0]+" ");
        System.out.print(name[0][1]+" ");
        System.out.print(name[1][0]+" ");
        System.out.print(name[1][1]+" ");
    }
}