public class ThreeNumberMax {

    public static void main(String[] args){

        int x, y, z;
        int maxXY, maxYZ, maxAll;

        x = 2;
        y = -4;
        z = 9;

        if (x < y){
            maxXY = y;
        }
        else{
            maxXY = x;
        }

        if (y < z){
            maxYZ = z;
        }
        else {
            maxYZ = y;
        }

        if (maxXY < maxYZ){
            maxAll = maxYZ;
        }
        else {
            maxAll = maxXY;
        }

        System.out.println(maxAll);

    }
}
