public class main {
    public static void main(String[] args) {

    }
    public static boolean isCatPlaying(boolean summer, int temperature){
        if(temperature<25 || temperature>45){
            return false;
        } else if(!summer && temperature>35){
            return false;
        } else {
            return true;
        }
    }
}
