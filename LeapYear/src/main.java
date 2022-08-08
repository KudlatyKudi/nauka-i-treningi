public class main {
    public static void main(String[] args) {
        if(isLeapYear(1800)) {
            System.out.println("rok przestepny");
        }
    }
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if (year % 4 > 0) {
            return false;
        } else {
            if(year % 100 == 0) {
                if (year % 400 == 0) {
                return true;
            } return false;
        }
        } return true;

    }
}
