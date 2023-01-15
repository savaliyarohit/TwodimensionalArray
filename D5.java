package TwodimensionalArray;

public class D5 {
    public static void main(String[] args) {
        int Home[][] = new int[2][2];
        Home[0][0] = 11453;
        Home[0][1] = 15534;

        Home[1][0] = 12367;
        Home[1][1] = 14552;


        for (int i = 0; i < Home.length; i++) {
            for (int j = 0; j < Home.length; j++) {
                System.out.println(Home[i][j]);
            }
        }
    }
}