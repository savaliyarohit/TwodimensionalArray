package TwodimensionalArray;

public class D8 {
    public static void main(String[] args) {
        int Phone[][] = new int[3][3];
        Phone[0][0] = 2564;
        Phone[0][1] = 5000;
        Phone[0][2] = 1230;

        Phone[1][0] = 4512;
        Phone[1][1] = 1235;
        Phone[1][2] = 2760;

        Phone[2][0] = 1622;
        Phone[2][1] = 2500;
        Phone[2][2] = 3150;
        for (int i = 0; i < Phone.length; i++) {
            for (int j = 0; j < Phone.length; j++) {
                System.out.println(Phone[i][j]);
            }
        }
    }
}