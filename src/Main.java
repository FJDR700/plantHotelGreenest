import plants.*;
import java.util.ArrayList;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        var pottedPlants = new ArrayList<Plant>();
        boolean stayInHotel = true;

        //pottedPlants-listan lägger in fyra olika växter med varsin namn och höjd
        ///Detta är en polymorfism (genom arv) eftersom Plant-objekten i listan kan
        ///identifiera sig som andra växttyper såsom Cactus, Palm och CarnivorousPlant.
        pottedPlants.add(new Cactus("Igge",20, "cm"));
        pottedPlants.add(new Palm("Laura", 5, "m"));
        pottedPlants.add(new CarnivorousPlant("Meatloaf", 0.7, "m"));
        pottedPlants.add(new Palm("Olof", 1, "m"));

        while (stayInHotel) {
            //Här skriver ut en lista av regristerade växter
            //och frågar dig om vilken växt ska få vätska.
            System.out.println(TextList.HOTEL_NAME); ///Konstant från TextList-enum.
            for (var checklist : pottedPlants) {System.out.println(checklist);}
            System.out.print(TextList.REQUEST_A_PLANT); ///Konstant från TextList-enum.
            String name = scan.nextLine().trim().toLowerCase();

            //Här söker fram en växt och beräknar fram dess vätskediet.
            ///Med polymorfismen implementerat kan man anropa polymorft där
            ///växternas samma metodanrop körs på olika sätt efter växttyp.
            ///Anropets kod är kortare utan att behöva ändra eller ha kedja.
            boolean noPottetPlant = true;
            for (var plants : pottedPlants) {
                if (plants.nameFound(name)) {
                    plants.calcAmount(); ///Olika formelberäkningar.
                    System.out.println(plants.getDiet()); ///Olika volymenheter och vätsketyper.
                    noPottetPlant = false;}
                else if (name.isBlank()) stayInHotel = false;
            }
            //Ett felmeddelande skrivs ut om man har angett
            //fel input eller om din sökta växt är okänd.
            if (noPottetPlant && stayInHotel)
                System.out.println(TextList.ERROR_MESSAGE); ///Konstant från TextList-enum.
            //Programmet avslutas när man anger ett tomt svar.
            if (stayInHotel) scan.nextLine();
        }
    }
}
