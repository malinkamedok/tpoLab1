package DomainModel;

import java.util.ArrayList;
import java.util.List;

public class Universe {

    private final List<Planet> alivePlanets = new ArrayList<>();
    private final List<Planet> destroyedPlanets = new ArrayList<>();
    private final List<Planet> conqueredPlanets = new ArrayList<>();

    public Universe() {
    }

    public boolean addAlivePlanet(Planet planet){
        if (!conqueredPlanets.contains(planet) && !destroyedPlanets.contains(planet) && planet.isAlive()) {
            alivePlanets.add(planet);
            return true;
        }
        return false;
    }

    public boolean addDestroyedPlanet(Planet planet){
        if ((alivePlanets.contains(planet) || conqueredPlanets.contains(planet)) && !destroyedPlanets.contains(planet) ) {
            destroyedPlanets.add(planet);
            return true;
        }
        return false;
    }

    public boolean addConqueredPlanet(Planet planet){
        if (alivePlanets.contains(planet) && !destroyedPlanets.contains(planet)) {
            alivePlanets.remove(planet);
            conqueredPlanets.add(planet);
            return true;
        }
        return false;
    }
}
