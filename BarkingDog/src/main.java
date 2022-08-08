public class main {
    public static void main(String[] args) {
        if(shouldWakeUp(true, 5)) {
            System.out.println("trza wstac");
        } else
            System.out.println("nie trza wstawac");
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if(barking == false) {
            return false;
        } else if(hourOfDay < 0 || hourOfDay > 24) {
            return false;
        } else if(hourOfDay >= 0 && hourOfDay < 8) {
            return true;
        } else if(hourOfDay >= 8 && hourOfDay <=22) {
            return false;
        } else if(hourOfDay > 22 && hourOfDay <= 24) {
            return true;
        }
        return barking;
    }
}
