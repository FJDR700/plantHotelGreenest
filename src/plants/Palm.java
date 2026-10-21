package plants;
//Arv
public class Palm extends Plant {
    //Inkapsling och enum
    private FluidList TAP_WATER = FluidList.TAP_WATER;
    private final String THE_PALM = "Palmen";

    public Palm(String name, double height, String heightUnit){
        super(name, height, heightUnit);
        this.type = THE_PALM;
    }
    
    //v Del av polymorfa anrop v
    @Override
    public void calcAmount() {
        fluidAmount = TAP_WATER.getFormula()*height*toMeter();
    }
    
    @Override
    public String getDiet() {
        return name + " behöver " + fluidAmount +
                " liter " + TAP_WATER +" per dag.";
    }
}
