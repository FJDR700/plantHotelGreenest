package plants;

//Denna enum-klass har ett fast antal möjliga vätskor med varsin namn och formel.
//Vätskorna, som är enum-konstanter med stora namn och underslag,
//ingår varsin strängnamn och nummerformel.
public enum FluidList {
    TAP_WATER( "kranvatten", 0.5d),
    PROTEIN_DRINK("proteindryck",0.2d),
    MINERAL_WATER("mineralvatten",0.02d);

    //Nyckelordet "final" gör instansvariablers värden oförändbara.
    private final String swedName;
    private final double formula;

    //En konstruktor som matar in en av konstanternas värden till variablerna.
    FluidList(String swedName, double formula) {
        this.swedName = swedName;
        this.formula = formula;
    }

    //När man tar fram en vätska, kan man ta antigen fram dess namn med en
    //överskriven toString-metod eller dess formel med en getFormula-metod.
    @Override
    public String toString() {return swedName;}
    public double getFormula() {return formula;}
}