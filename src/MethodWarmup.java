

public class MethodWarmup {

    public static double getDifference(int x, int y){
        if(y > x) return  y - x;
        return x - y;
    }

//    public static double getDoubleDifference(double x, double y){
//        return x ; y ;
//    }


    public static void main(String[] args) {

        System.out.println(getDifference(80 , 32));
//        System.out.println(getDoubleDifference(10-5, 7-3));
    }
}
