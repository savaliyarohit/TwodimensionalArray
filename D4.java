package TwodimensionalArray;

public class D4 {
    public static void main(String[] args) {
        int data[][] = new int[3][3];
        data[0][0] = 34;
        data[0][1] = 50;
        data[0][2] = 140;

        data[1][0] = 123;
        data[1][1] = 152;
        data[1][2] = 210;

        data[2][0] = 122;
        data[2][1] = 255;
        data[2][2] = 300;

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                System.out.println(data[i][j]);
            }
        }
    }
}