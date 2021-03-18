public class Cereal
{
     private int potassium;
    private String name = "";

    public Cereal(String name, int potassium)
    {
        this.potassium = potassium;
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public int getPotassium()
    {
        return potassium;
    }

    public String toString()
    {
        return name; 
    }

    public static void main(String[] args)
    {
        Cereal cocoaPuffs = new Cereal("Cocoa Puffs", 55);
        Cereal allBranFiber = new Cereal("All-Bran with Extra Fiber", 330);
        Cereal branChex = new Cereal("Bran Chex", 190);

        System.out.println(cocoaPuffs);
    }
    
}