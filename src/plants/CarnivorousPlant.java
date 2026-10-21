package plants;
public class CarnivorousPlant extends Plant {
    private FluidList PROTEIN_DRINK = FluidList.PROTEIN_DRINK;
    private final String THE_CARNIVOROUS_PLANT = "Köttätande växten";
    private final double BASE_LEVEL = 0.1d;

    public CarnivorousPlant(String name, double height, String heightUnit){
        super(name, height, heightUnit);
        this.type = THE_CARNIVOROUS_PLANT;
    }
    
    @Override
    public void calcAmount(){
        fluidAmount = BASE_LEVEL+(PROTEIN_DRINK.getFormula()*height*toMeter());
    }
    
    @Override
    public String getDiet() {
        return name + " behöver " + fluidAmount +
                " liter " + PROTEIN_DRINK + " per dag.";
    }
}
