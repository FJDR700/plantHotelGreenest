
//Denna enum-klass har ett fast antal möjliga programtexter för Main-klassen.
//Programtexter, som är enum-konstanter med stora namn och underslag,
//ingår varsin strängtext.
//Main-klassens kod blir då korta och lättlästa med dessa konstanter.
public enum TextList {
    HOTEL_NAME("~~~Växthotellet Greenest~~~"),
    REQUEST_A_PLANT("\nVilken växt ska få vätska?" +
            "\n(Ange ett tomt svar för att lämna hotellet)"+
            "\nNamn: "),
    ERROR_MESSAGE("Okänd växt eller fel input!");

    //Nyckelordet "final" gör en instansvariabelns värde oförändbar.
    private final String swedText;

    //En konstruktor som matar in en av konstanternas värde till variabeln.
    TextList(String swedText) {this.swedText = swedText;}

    //En överskriven toString-metod som returnerar en programtext.
    @Override
    public String toString() {return swedText;}
}