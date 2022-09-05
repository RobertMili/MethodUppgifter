public class Three {
    /*
    3 Skriv en funktion som tar tre parametrar: name, city och favoriteNumber. Talet ska ha datatypen byte och de andra ska vara string.
    Funktionen ska skriva ut informationen till konsolen i en fullständig mening. Exempel "Välkommen Namn från Göteborg med favorittal 12".
     */
    public static void main(String[] args) {

        threePaarametrar(12, "Robert", "Gothernborg");
    }
    static void threePaarametrar(int favoritNumber, String name, String city){
        System.out.println("Völkommen " + name + " från " + city + " med favorite tal " + favoritNumber);
    }
}
