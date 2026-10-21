package plants;
//Samma förekomningar som Palm-klassen
public class Cactus extends Plant {
    private FluidList MINERAL_WATER = FluidList.MINERAL_WATER;
    private final String THE_CACTUS = "Kaktusen";
    private final int TO_CL = 100;

    public Cactus(String name, double height, String heightUnit){
        super(name, height, heightUnit);
        this.type = THE_CACTUS;
    }
    
    @Override
    public void calcAmount(){
        fluidAmount = MINERAL_WATER.getFormula()*TO_CL;
    }
    
    @Override
    public String getDiet() {
        return name + " behöver " + fluidAmount +
                " centiliter " + MINERAL_WATER + " per dag.";
    }
}
