package TwodimensionalArray;

public class D9 {
    public static void main(String[] args) {
        int Bike[][] = new int[3][3];
        Bike[0][0] = 20;
        Bike[0][1] = 15;
        Bike[0][2] = 410;

        Bike[1][0] = 142;
        Bike[1][1] = 125;
        Bike[1][2] = 220;

        Bike[2][0] = 522;
        Bike[2][1] = 325;
        Bike[2][2] = 350;

        for (int i = 0; i < Bike.length; i++) {
            for (int j = 0; j < Bike.length; j++) {
                System.out.println(Bike[i][j]);
            }
        }
    }
}