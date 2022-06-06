package DomainModel;

public class Chair {

    private final String model;
    private final int criticalWeight;
    private int durability;

    private Character chairHolder;

    public Chair(String model, int criticalWeight) {
        this.model = model;
        this.criticalWeight = criticalWeight;
        this.durability = criticalWeight;
    }

    public void placeCharacter(Character chel) {
        this.chairHolder = chel;
        this.durability -= chel.getWeight();
    }

    public int getDurability() {
        return durability;
    }
}
