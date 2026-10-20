package plants;

//Här ärver subklassen instansvariabler och -metoder från Plant-basklassen.
//Det inkluderar även metoder från interfacet som Plant-klassen har implementerat.
public class Palm extends Plant {
    //Variabler och metoder med "private"
    //syns och används bara från sin egen klass.
    //Konstanter med "final" har alltid oförändbara värden.
    private FluidList TAP_WATER = FluidList.TAP_WATER;
    private final String THE_PALM = "Palmen";

    public Palm(String name, double height, String heightUnit){
        //Här hämtas basklassens konstruktor till subklassens med super.
        super(name, height, heightUnit);
        this.type = THE_PALM;
    }
    //Här överskrivs interface-metoder till att ha olika funktioner såsom att...
    //...beräkna fram vätskemängd genom en formel för palmer.
    @Override
    public void calcAmount() {
        fluidAmount = TAP_WATER.getFormula()*height*toMeter();
    }
    //...returnera palmens beräknad mängd kranvatten på liter.
    @Override
    public String getDiet() {
        return name + " behöver " + fluidAmount +
                " liter " + TAP_WATER +" per dag.";
    }
    //Metoderna efter palmtyp kommer att ta
    //del av polymorfa anrop i Main-klassen.
}
