package DomainModel;

public class Band {

    private final String name;
    private final Universe universe;

    public Band(String name, Universe universe) {
        this.name = name;
        this.universe = universe;
    }

    public boolean conquerePlaner(Planet planet) {
        if (planet.isAlive() && !planet.isConquered()) {
            planet.setConquered(true);
            universe.addConqueredPlanet(planet);
            return true;
        }
        return false;
    }
}
