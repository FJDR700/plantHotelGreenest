package plants;
public enum FluidList {
    TAP_WATER( "kranvatten", 0.5d),
    PROTEIN_DRINK("proteindryck",0.2d),
    MINERAL_WATER("mineralvatten",0.02d);
    
    private final String swedName;
    private final double formula;
    
    FluidList(String swedName, double formula) {
        this.swedName = swedName;
        this.formula = formula;
    }
    
    @Override
    public String toString() {return swedName;}
    public double getFormula() {return formula;}
}
