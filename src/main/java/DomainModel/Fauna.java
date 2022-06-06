package DomainModel;

import java.util.ArrayList;
import java.util.List;

public class Fauna {

    private final List<Animal> animalList = new ArrayList<>();

    public Fauna() {
    }

    public int getCountsOfAnimals(){
        return animalList.size();
    }

    public boolean hasFauna() {
        return animalList.size() != 0;
    }

    public void addAnimal(Animal animal){
        if (animal.getAlive())
            animalList.add(animal);
    }

    public boolean deleteAnimal(Animal animal)
    {
        boolean result = animalList.contains(animal);
        if (result)
        {
            animalList.removeIf(faunaAnimal -> faunaAnimal.equals(animal));
        }
        return result;}
}
