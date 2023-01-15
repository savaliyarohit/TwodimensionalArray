package TwodimensionalArray;

public class D6 {
    public static void main(String[] args) {
        int Company[][] = new int[4][4];
        Company[0][0] = 123;
        Company[0][1] = 243;
        Company[0][2] = 120;
        Company[0][3] = 99;

        Company[1][0] = 143;
        Company[1][1] = 880;
        Company[1][2] = 493;
        Company[1][3] = 137;

        Company[2][0] = 167;
        Company[2][1] = 487;
        Company[2][2] = 300;
        Company[2][3] = 602;

        Company[3][0] = 390;
        Company[3][1] = 425;
        Company[3][2] = 335;
        Company[3][3] = 525;

        for (int i = 0; i < Company.length; i++) {
            for (int j = 0; j < Company.length; j++) {
                System.out.println(Company[i][j]);

            }
        }
    }
}