package zoo;

public class Veterinarian extends Animal {
    private String nameVeterinarian;

    public Veterinarian(String nameVeterinarian) {
        this.nameVeterinarian = nameVeterinarian;
    }

    public String getNameVeterinarian() {
        return nameVeterinarian;
    }

    public Veterinarian() {
    }

    public void setNameVeterinarian(String nameVeterinarian) {
        this.nameVeterinarian = nameVeterinarian;
    }

    void treatAnimal(Animal animal) {
        System.out.println(animal.getTapeAnimals() + " eating "
                + animal.getFood() + " still " + animal.getLocation());
    }

    public static void main(String[] args) {
        Veterinarian veterinarian = new Veterinarian(" Vasya");
        Animal[] animal = new Animal[3];
        animal[0] = new Cat("Fish", "home", "Frankinshtain", "British");
        animal[1] = new Dog("miet ", "flor", "Sharik", "pikines");
        animal[2] = new Horse("canabis", "hlev", "Oslic", 5.6);
        for (Animal animal : animal) {
            veterinarian.treatAnimal(animal);
        }

    }
}
