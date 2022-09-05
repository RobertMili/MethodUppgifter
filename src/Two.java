public class Two {
    /*
    2a Skriv en funktion add som lägger ihop två tal av datatypen double och returnerar resultatet.
    2b Skriv en funktion multi som multiplicerar tre tal och returnerar resultatet.
    2c Skriv en funktion som kan ta emot obegränsat med parametrar. Den ska multiplicera alla och returnera resultatet.

     */
    public static void main(String[] args) {



        System.out.println(doubleAdd(2.5,2.5) + "\n");
        System.out.println(doubleMulti(2.5,2.5) + "\n");
        System.out.println(unlimitetParametar(1,1,2,2));
    }
    public static double doubleAdd(double x, double y){
        double sum = x + y;
        return sum;
    }
    public static double doubleMulti(double x, double y){
        double sum = x * y;
        return sum;
    }
    public static int unlimitetParametar (int...x){
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        return sum;

    }

}
