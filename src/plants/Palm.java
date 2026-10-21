package plants;
public class Palm extends Plant {
    private FluidList TAP_WATER = FluidList.TAP_WATER;
    private final String THE_PALM = "Palmen";

    public Palm(String name, double height, String heightUnit){
        super(name, height, heightUnit);
        this.type = THE_PALM;
    }
    @Override
    public void calcAmount() {
        fluidAmount = TAP_WATER.getFormula()*height*toMeter();
    }
    @Override
    public String getDiet() {
        return name + " behöver " + fluidAmount +
                " liter " + TAP_WATER +" per dag.";
    }
    //Metoderna efter palmtyp kommer att ta
    //del av polymorfa anrop i Main-klassen.
}
