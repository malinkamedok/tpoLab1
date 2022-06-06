package DomainModel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniverseTest {

    @Test
    void basicActivityUniverseTest() {
        Universe u = new Universe();
        assertTrue(u.addAlivePlanet(new Planet(true, false, false, "LexaMoscowEnjoyer", null)));
        assertFalse(u.addAlivePlanet(new Planet(false, false, false, "Petya", null)));
    }

    @Test
    void conqueredUniverseTest() {
        Universe universe = new Universe();
        Planet p = new Planet(true, false, false, "RomaChach", null);
        assertFalse(universe.addConqueredPlanet(p));
        assertTrue(universe.addAlivePlanet(p));
        assertTrue(universe.addConqueredPlanet(p));
    }

    @Test
    void destroydUniverseTest() {
        Universe universe = new Universe();
        Planet p = new Planet(true, false, false, "Kostyan", null);
        assertTrue(universe.addAlivePlanet(p));
        assertTrue(universe.addDestroyedPlanet(p));
        assertFalse(universe.addDestroyedPlanet(p));
        assertFalse(p.isDestroyed());
        assertEquals(p.getName(), "Kostyan");
        assertNull(p.getFauna());
    }

}