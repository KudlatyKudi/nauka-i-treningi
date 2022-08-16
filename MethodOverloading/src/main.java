public class main {
    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        System.out.println(calcFeetAndInchesToCentimeters(3, 9));
        System.out.println(calcFeetAndInchesToCentimeters(72));
    }
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches){
        if(feet < 0 || inches <0 || inches >12){
            return -1;
        }
        double centimeters = ((feet * 12d) + inches) * 2.54d;
        return centimeters;
    }
    public static double calcFeetAndInchesToCentimeters(int inches) {
        if(inches < 0){
            return -1;
        }
        double feetFromInches = inches / 12d;
        double remainderFromInches = inches % 12d;
        return calcFeetAndInchesToCentimeters((int) feetFromInches, (int) remainderFromInches);



    }
}
