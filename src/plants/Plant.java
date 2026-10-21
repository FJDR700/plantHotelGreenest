package plants;
//Interface
public abstract class Plant implements FluidDiet {
    //Inkapsling
    protected String name, type, heightUnit;
    protected double height, fluidAmount;

    protected Plant(String name, double height, String heightUnit){
        this.name = name.trim();
        this.height = Math.abs(height);
        this.heightUnit = heightUnit.trim();
    }
    
    //Inkapsling
    public boolean nameFound(String name) {
        return name.equals(this.name.toLowerCase());
    }
    
    protected double toMeter(){
        return switch (heightUnit) {
            case "m" -> 1; case "dm" -> 0.1d;
            case "cm" -> 0.01d; default -> 0;
        };
    }
    
    @Override
    public String toString() {
        return type + " " + name + ", " +
                height + " " + heightUnit + " hög";
    }
}
