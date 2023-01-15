package TwodimensionalArray;

public class D1 {
    public static void main(String[] args) {
        int car[][] = new int[3][3];
        car[0][0]=2;
        car[0][1]=5;
        car[0][2]=10;

        car[1][0]=12;
        car[1][1]=15;
        car[1][2]=20;

        car[2][0]=22;
        car[2][1]=25;
        car[2][2]=30;
        for(int i=0;i< car.length;i++){
            for(int j=0;j< car.length;j++){
                System.out.println(car[i][j]);
            }
        }

    }
}
