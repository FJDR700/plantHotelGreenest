import plants.*;
import java.util.ArrayList;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        var pottedPlants = new ArrayList<Plant>();
        boolean stayInHotel = true;

        //Polymorfism och arv
        pottedPlants.add(new Cactus("Igge",20, "cm"));
        pottedPlants.add(new Palm("Laura", 5, "m"));
        pottedPlants.add(new CarnivorousPlant("Meatloaf", 0.7, "m"));
        pottedPlants.add(new Palm("Olof", 1, "m"));

        while (stayInHotel) {
            System.out.println(TextList.HOTEL_NAME); //Enum
            for (var checklist : pottedPlants) {System.out.println(checklist);}
            System.out.print(TextList.REQUEST_A_PLANT);
            String name = scan.nextLine().trim().toLowerCase();

            boolean noPottetPlant = true;
            //Polymorfa anrop
            for (var plants : pottedPlants) {
                if (plants.nameFound(name)) {
                    plants.calcAmount();
                    System.out.println(plants.getDiet());
                    noPottetPlant = false;}
                else if (name.isBlank()) stayInHotel = false;
            }
            if (noPottetPlant && stayInHotel)
                System.out.println(TextList.ERROR_MESSAGE);
            if (stayInHotel) scan.nextLine();
        }
    }
}
