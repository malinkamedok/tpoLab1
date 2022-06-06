package DomainModel;

public class Planet {

    private boolean isAlive;
    private boolean destroyed;
    private boolean conquered;
    private final String name;
    private Fauna fauna;

    public Planet(boolean isAlive, boolean destroyed, boolean conquered, String name, Fauna fauna) {
        this.isAlive = isAlive;
        this.destroyed = destroyed;
        this.conquered = conquered;
        this.name = name;
        this.fauna = fauna;
    }

    public boolean isAlive() {
        return this.isAlive;
    }

    public void setConquered(boolean conquered) {
        this.conquered = conquered;
    }

    public boolean isConquered() {
        return conquered;
    }

    public boolean isDestroyed() {
        return destroyed;
    }

    public String getName() {
        return name;
    }

    public Fauna getFauna() {
        return fauna;
    }
}
