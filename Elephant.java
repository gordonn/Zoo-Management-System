public class Elephant extends Animal {
    private String dietType;
    // This is a instance variable that is unique to this animal subclass

    public Elephant(String name, int age, String dietType) {
        super("Elephant", age, name);
        // This is referencing the original constructor variables while replacing species with the species value
        this.dietType = dietType;
        // This constructor allows for the input of a unique variable as outlined in the assignment parameters.
    }

    @Override
    // @Override is polymorphism and allows us to perform a single method in many different ways
    public void makeSound() {
        System.out.println("Trumpet!");
    }

    // A unique method to the elephant class
    public void sprayWater() {
        System.out.println("Elephant is spraying water");
    }
}   