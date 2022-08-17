public class main {
    public static void main(String[] args) {

    }
    public static double area(double radius) {
        if(radius < 0){
            return -1.0d;
        }
        return Math.PI * radius * radius;
    }
    public static double area(double x, double y){
        if(x<0 || y<0){
            return -1.0d;
        }
        return x * y;
    }
}
