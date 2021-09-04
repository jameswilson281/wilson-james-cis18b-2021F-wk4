package animal.herbivore;

import animal.Animal;

public class Giraffe implements Animal {
    String name;
    String type = "Giraffe";

    public Giraffe(String name)
    {
        this.name = name;
    }

    public String getName() { return this.name; }
    public String getType() { return this.type; }
}
