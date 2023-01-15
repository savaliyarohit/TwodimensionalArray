package TwodimensionalArray;

public class D10 {
    public static void main(String[] args) {
        int School[][] = new int[2][2];
        School[0][0] = 154;
        School[0][1] = 123;

        School[1][0] = 127;
        School[1][1] = 552;


        for (int i = 0; i < School.length; i++) {
            for (int j = 0; j < School.length; j++) {
                System.out.println(School[i][j]);
            }
        }
    }
}