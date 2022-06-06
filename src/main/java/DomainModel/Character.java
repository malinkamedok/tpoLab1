package DomainModel;

public class Character {
    private final String name;
    private final String color;
    private boolean isBullied;
    private int weight;

    public Character(String name, String color, int weight) {
        this.name = name;
        this.color = color;
        this.isBullied = false;
        this.weight = Math.max(weight, 0);
    }

    public void screamOnSomebody(Character somebody) {
        if (this.name.equals(somebody.getName())) {
            this.isBullied = true;
        } else {
            throw new IllegalArgumentException("Same person");
        }
    }
    public boolean isBullied() {
        return isBullied;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

}
