public class main {
    public static void main(String[] args) {

    }
    public static boolean hasTeen(int first, int second, int third){
        return isTeen(first) || isTeen(second) || isTeen(third);
    }
    public static boolean isTeen(int fourth){
        return fourth >= 13 && fourth <= 19;
    }
}
