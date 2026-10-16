package plants;

//Här i denna interface finns en lista av toma abstrakta metoder som ska
//ge olika växtobjekt egenskaper att beräkna och returnera sin vätskediet.
//Interfacen beskriver vilken sorts vätska och hur
//mycket av den en specifik växt ska få per dag.
public interface FluidDiet {
    String getDiet();
    void calcAmount();
}