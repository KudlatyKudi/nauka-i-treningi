public class main {
    public static void main(String[] args) {
        printYearsAndDays(1440);
        int godziny = 60*24*365;
        System.out.println(godziny);

    }
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long years = minutes / (525600);
            long days = (minutes % 525600)/1440;
            System.out.println(minutes + " min = " + years + " y and " + days +
                    " d");
        }
    }
}
