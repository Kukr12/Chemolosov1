package zoo;

public class Animal {
    private String tapeAnimals;
    private String food;
    private String location;

    public Animal(String tapeAnimals) {
        this.tapeAnimals = tapeAnimals;
    }

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public Animal() {

    }

    public String getTapeAnimals() {
        return tapeAnimals;
    }

    public void setTapeAnimals(String tapeAnimals) {
        this.tapeAnimals = tapeAnimals;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    void makeNoise() {
        System.out.println(getTapeAnimals() + " make noise");
    }

    void sleep() {
        System.out.println(getTapeAnimals() + " sleep");
    }

    void eat() {
        System.out.println(getTapeAnimals() + " eat");
    }
}
