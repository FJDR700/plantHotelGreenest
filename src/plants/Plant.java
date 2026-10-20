package plants;

//Klassen med "abstract" kan inte skapas objekt av, bara ärvas av sina subklasser.
//Den implementerar metoder från ett interface så att subklasserna kan ärva dem.
public abstract class Plant implements FluidDiet {
    //Variabler och metoder med "protected"
    //syns och används bara från sin egen klass och dess subklasser.
    protected String name, type, heightUnit;
    protected double height, fluidAmount;

    protected Plant(String name, double height, String heightUnit){
        this.name = name.trim();
        this.height = Math.abs(height);
        this.heightUnit = heightUnit.trim();
    }
    //Variabler och metoder med "public" kan synas
    //och användas från vilket klass som helst.
    //En boolean-metod som ska verifiera om växtens namn är funnen.
    public boolean nameFound(String name) {
        return name.equals(this.name.toLowerCase());
    }
    //En metod som ska användas av subklassers calcAmount-metod
    //där height-variabeln konverteras till meter.
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
