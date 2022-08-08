public class main {
    public static void main(String[] args) {

        double liczba = 5.4980d;
        System.out.println(liczba);
        if(areEqualByThreeDecimalPlaces(-3.1756,-3.175)) {
            System.out.println("git");
        }
    }

    public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo) {
        double oneThousand = numberOne * 1000;
       double twoThousand = numberTwo * 1000;

       int oneInt = (int)oneThousand;
       int twoInt = (int)twoThousand;

       if(oneInt == twoInt) {}
       return true;
    }

    return false;
}
