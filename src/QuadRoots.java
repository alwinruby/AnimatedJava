public class QuadRoots{

    public static void main(String[] args){

        double Dd, x1, x2;

        double a, b, c;

        //a=1; b=2; c=-3;

        //a=1; b=4; c=4;

        a=1; b=1; c=0.5;


        Dd = b*b - 4*a*c;

        System.out.println(Dd);


        if (Dd>0){


            x1=(-b+Math.sqrt(Dd))/(2*a);

            System.out.println(x1);


            x2=(-b+Math.sqrt(Dd))/(2*a);

            System.out.println(x2);

        }

        else if (Dd==0){

            x1=(-b)/(2*a);

            System.out.println(x1);

        }

        else//(Dd<)

        {

            System.out.println((-b)/(2*a)+"+i"+Math.sqrt(-Dd)/(2*a));

            System.out.println((-b)/(2*a)+"-i"+Math.sqrt(-Dd)/(2*a));

        }
        
    }

}