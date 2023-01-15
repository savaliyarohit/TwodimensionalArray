package TwodimensionalArray;

public class D3 {
    public static void main(String[] args) {
        int HomeLoan[][] = new int[5][5];
        HomeLoan[0][0] = 200;
        HomeLoan[0][1] = 205;
        HomeLoan[0][2] = 1500;
        HomeLoan[0][3] = 198;
        HomeLoan[0][4] = 108;


        HomeLoan[1][0] = 232;
        HomeLoan[1][1] = 1687;
        HomeLoan[1][2] = 245;
        HomeLoan[1][3] = 298;
        HomeLoan[1][4] = 808;

        HomeLoan[2][0] = 231;
        HomeLoan[2][1] = 250;
        HomeLoan[2][2] = 300;
        HomeLoan[2][3] = 1021;
        HomeLoan[2][4] = 543;

        HomeLoan[3][0] = 900;
        HomeLoan[3][1] = 458;
        HomeLoan[3][2] = 336;
        HomeLoan[3][3] = 553;
        HomeLoan[3][4] = 111;

        HomeLoan[4][0] = 965;
        HomeLoan[4][1] = 411;
        HomeLoan[4][2] = 324;
        HomeLoan[4][3] = 437;
        HomeLoan[4][4] = 1098;


        for (int i = 0; i < HomeLoan.length; i++) {
            for (int j = 0; j < HomeLoan.length; j++) {
                System.out.println(HomeLoan[i][j]);

            }
        }
    }
}