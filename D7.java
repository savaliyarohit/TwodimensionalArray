package TwodimensionalArray;

public class D7 {
    public static void main(String[] args) {
        int City[][] = new int[2][2];

    City[0][0]=157480;
    City[0][1]=315534;

    City[1][0]=120367;
    City[1][1]=112552;


        for(int i = 0; i<City.length;i++){
            for (int j = 0; j < City.length; j++) {
            System.out.println(City[i][j]);
        }
    }
}
}