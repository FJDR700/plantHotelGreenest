package plants;

//Här ärver subklassen instansvariabler och -metoder från Plant-superklassen.
//Det inkluderar även interface-metoder som Plant-klassen har implementerat.
public class CarnivorousPlant extends Plant {
    //Konstanter med "final" har alltid oförändbara värden.
    private FluidList PROTEIN_DRINK = FluidList.PROTEIN_DRINK;
    private final String THE_CARNIVOROUS_PLANT = "Köttätande växten";
    private final double BASE_LEVEL = 0.1d;

    public CarnivorousPlant(String name, double height, String heightUnit){
        //Här hämtas superklassens konstruktor till subklassens med super.
        super(name, height, heightUnit);
        this.type = THE_CARNIVOROUS_PLANT;
    }
    //Här överskrivs metoder från interfacet till att ha olika funktioner såsom att...
    //...beräkna fram vätskemängd genom en formel för köttätande växter.
    @Override
    public void calcAmount(){
        fluidAmount = BASE_LEVEL+(PROTEIN_DRINK.getFormula()*height*toMeter());
    }
    //...returnera köttätande växtens beräknad mängd proteindryck på liter.
    @Override
    public String getDiet() {
        return name + " behöver " + fluidAmount +
                " liter " + PROTEIN_DRINK + " per dag.";
    }
    //Metoderna efter köttätande växttyp kommer att
    //ta del av polymorfa anrop i Main-klassen.
}