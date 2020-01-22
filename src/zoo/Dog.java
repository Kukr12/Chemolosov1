package zoo;

public class Dog extends Animal {
    private String nameDog;
    private String breed;

    public Dog(String tapeAnimals, String nameDog, String breed) {
        super(tapeAnimals);
        this.nameDog = nameDog;
        this.breed = breed;
    }

    public Dog(String food, String location, String nameDog, String breed) {
        super(food, location);
        this.nameDog = nameDog;
        this.breed = breed;
    }

    public Dog() {
    }

    public Dog(String nameDog, String breed) {
        this.nameDog = nameDog;
        this.breed = breed;
    }

    public String getNameDog() {
        return nameDog;
    }

    public void setNameDog(String nameDog) {
        this.nameDog = nameDog;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Dog(String tapeAnimals) {
        super(tapeAnimals);
    }

    @Override
    void makeNoise() {
        super.makeNoise();
        System.out.println(getNameDog() + " gav ");
    }

    @Override
    void eat() {
        super.eat();
        System.out.println(getFood() + " Food for dog ");
    }
}
