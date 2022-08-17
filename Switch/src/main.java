public class main {
    public static void main(String[] args) {
        int value = 1;
        if(value==1) {
            System.out.println("Value was 1");
        } else if (value==2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

        int switchValue = 1;
        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1,2,3,4 or 5");
                break;
        }

        char switchedChar = 'D';
        switch(switchedChar){
            case 'A':
                System.out.println("A");
                break;

            case 'B':
                System.out.println("B");
                break;

            case 'C':case  'D':case  'E':
                System.out.println("C, D, E");
                break;

            default:
                System.out.println("żadne z nich");
                break;

        }
        String month = "JunE";
        switch(month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
                break;
        }
    }
}
