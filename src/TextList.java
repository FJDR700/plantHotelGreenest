public enum TextList {
    HOTEL_NAME("~~~Växthotellet Greenest~~~"),
    REQUEST_A_PLANT("\nVilken växt ska få vätska?" +
            "\n(Ange ett tomt svar för att lämna hotellet)"+
            "\nNamn: "),
    ERROR_MESSAGE("Okänd växt eller fel input!");
    
    private final String swedText;

    TextList(String swedText) {this.swedText = swedText;}

    @Override
    public String toString() {return swedText;}
}
