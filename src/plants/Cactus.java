package plants;

//Här ärver subklassen instansvariabler och -metoder från Plant-superklassen.
//Det inkluderar även interface-metoder som Plant-klassen har implementerat.
public class Cactus extends Plant {
    //Konstanter med "final" har alltid oförändbara värden.
    private FluidList MINERAL_WATER = FluidList.MINERAL_WATER;
    private final String THE_CACTUS = "Kaktusen";
    private final int TO_CL = 100;

    public Cactus(String name, double height, String heightUnit){
        //Här hämtas superklassens konstruktor till subklassens med super.
        super(name, height, heightUnit);
        this.type = THE_CACTUS;
    }
    //Här överskrivs metoder från interfacet till att ha olika funktioner såsom att...
    //...beräkna fram vätskemängd genom en formel för kaktusar, oberoende av höjd.
    @Override
    public void calcAmount(){
        fluidAmount = MINERAL_WATER.getFormula()*TO_CL;
    }
    //...returnera kaktusens beräknad mängd mineralvatten på centiliter.
    @Override
    public String getDiet() {
        return name + " behöver " + fluidAmount +
                " centiliter " + MINERAL_WATER + " per dag.";
    }
    //Metoderna efter kaktustyp kommer att ta
    //del av polymorfa anrop i Main-klassen.
}