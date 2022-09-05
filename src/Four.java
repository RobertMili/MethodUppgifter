public class Four {
    /*
    4 Skriv en funktion som tar en parameter av datatypen string och returnerar ett tal av datatypen int. Om det inte går att göra om parametern till ett tal ska funktionen kasta ett Exception.
     */
    public static void main(String[] args) {


    convertStringToInt("155050");
    convertStringToInt("AAAAAa");
    }
    public static void convertStringToInt (String num) {
        try {
            int converNum = Integer.parseInt(num);
            System.out.println(converNum);

        } catch (Exception e){
            System.out.println("Something went wrong");
        }

    }
}
