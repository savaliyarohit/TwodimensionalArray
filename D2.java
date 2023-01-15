package TwodimensionalArray;

public class D2 {
    public static void main(String[] args) {
        int Employee[][] = new int[4][4];
        Employee[0][0] = 10;
        Employee[0][1] = 25;
        Employee[0][2] = 12;
        Employee[0][3] = 120;

        Employee[1][0] = 50;
        Employee[1][1] = 88;
        Employee[1][2] = 49;
        Employee[1][3] = 37;

        Employee[2][0] = 23;
        Employee[2][1] = 25;
        Employee[2][2] = 30;
        Employee[2][3] = 102;

        Employee[3][0] = 90;
        Employee[3][1] = 45;
        Employee[3][2] = 33;
        Employee[3][3] = 55;

        for (int i = 0; i < Employee.length; i++) {
            for (int j = 0; j < Employee.length; j++) {
                System.out.println(Employee[i][j]);
            }
        }
    }
}