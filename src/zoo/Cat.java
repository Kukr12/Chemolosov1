package zoo;

public class Cat extends Animal {
    private String nameCat;
    private String breed;

    public Cat(String tapeAnimals, String nameCat, String breed) {
        super(tapeAnimals);
        this.nameCat = nameCat;
        this.breed = breed;
    }

    public Cat(String food, String location, String nameCat, String breed) {
        super(food, location);
        this.nameCat = nameCat;
        this.breed = breed;
    }

    public Cat(String nameCat, String breed) {
        this.nameCat = nameCat;
        this.breed = breed;
    }

    public Cat() {

    }

    public String getNameCat() {
        return nameCat;
    }

    public void setNameCat(String nameCat) {
        this.nameCat = nameCat;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    void makeNoise() {
        super.makeNoise();
        System.out.println(getNameCat() + " myu");
    }

    @Override
    void eat() {
        super.eat();
        System.out.println(getNameCat()+ " Food for Cat");
    }
}
