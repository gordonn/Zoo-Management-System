public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        // Instantiation of the zoo class

        // Adding animals to the zoo
        Lion lion = new Lion("Leo", 5, "Savannah");
        Elephant elephant = new Elephant("Hannibal", 10, "Herbivore");

        // Adding animals into the arraylist
        zoo.addAnimal(lion);
        zoo.addAnimal(elephant);

        // Displaying animals in the zoo
        zoo.displayAnimals();

        // Simulate a day at the zoo
        zoo.simulateDay();
    }
}
