package zoo;

public class Horse extends Animal {
    private String nameHorse;
    private double speed;

    public Horse(String tapeAnimals, String nameHorse, double speed) {
        super(tapeAnimals);
        this.nameHorse = nameHorse;
        this.speed = speed;
    }

    public Horse(String food, String location, String nameHorse, double speed) {
        super(food, location);
        this.nameHorse = nameHorse;
        this.speed = speed;
    }

    public Horse(String nameHorse, double speed) {
        this.nameHorse = nameHorse;
        this.speed = speed;
    }

    public String getNameHorse() {
        return nameHorse;
    }

    public void setNameHorse(String nameHorse) {
        this.nameHorse = nameHorse;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    void makeNoise() {
        super.makeNoise();
        System.out.println(getNameHorse() + " igo--go");
    }

    @Override
    void eat() {
        super.eat();
        System.out.println(getNameHorse()+ " eat food for horse ");
    }
}
