public class ThreeNumberMaxTwo {

    public static void main(String[] args){

        int x, y, z;
        int maxAll;

        x=9; y=102; z=22;

        maxAll = x;

        if (maxAll < y) {
            maxAll = y;
        }
        if (maxAll < z) {
            maxAll = z;
        }

        System.out.println(maxAll);

    }

}