public class Main {
    public static void main(String[] args) {


       printMegaBytesAndKiloBytes(6008);

    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int remainingKilobytes = kiloBytes % 1024;
            int megaBytes = kiloBytes / 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes +
                    " MB and " + remainingKilobytes +
                    " KB");
        }
    }
}
