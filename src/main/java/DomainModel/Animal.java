package DomainModel;

public class Animal {

    private final String name;
    private final Integer age;
    private final Boolean isPredator;
    private final Boolean isAlive;

    public Animal(String name, Integer age, Boolean isPredator, Boolean isAlive) {
        this.name = name;
        this.age = age;
        this.isPredator = isPredator;
        this.isAlive = isAlive;
    }

    public String getName() {
        return name;
    }

    public Boolean getAlive() {
        return isAlive;
    }

    public Boolean getPredator() {
        return isPredator;
    }
}
