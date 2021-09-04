package animal.carnivore;
import animal.Animal;

public class Lion implements Animal {
    String name;
    String type = "Lion";

    public Lion(String name)
    {
        this.name = name;
    }

    public String getName() { return this.name; }
    public String speak(){
        return "The lion roars!";
    }
    public String getType() { return this.type; }

}
