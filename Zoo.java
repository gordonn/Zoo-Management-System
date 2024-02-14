import java.util.ArrayList;
// A neccesary package

class Zoo {
    private ArrayList<Animal> animals;
    // A array list which is a list of animals that can be added or removed.

    public Zoo() {
        animals = new ArrayList<>();
    }
    // When the Zoo method is called, it will create a animals arrayList

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }
    // Everytime a parameter that matches a specific animal is utilized in
    // Main.java, that animal will be created and added to the arraylist, this is
    // why it was important to extend the animals as part of the animal parent class

    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }
    // Removes a animal from the ArrayList

    public void displayAnimals() {
        System.out.println("Animals in the zoo:");
        for (Animal animal : animals) {
            System.out.println(animal.species + " - " + animal.name);
        }
    }
    // Will go through all the animals in the arrayList and print out there
    // information

    // The "for (Animal animal : animals) could be represented in a traditional for
    // loop as
    // for (int i = 0; i < animals.length; i++) {
    // Animal animal = animals[i];
    // System.out.println(animal.species + " - " + animal.name);
    // }
    // It is simply syntatic sugar and more efficient to write it that way

    // Simulate a day at the zoo
    public void simulateDay() {
        for (Animal animal : animals) {
            System.out.println(animal.name + " is in the zoo:");
            animal.makeSound();
            animal.eat();
            animal.sleep();

            // AI code:
            if (animal instanceof Lion) {
                Lion lion = (Lion)animal;
                lion.roam();
                //((Lion)animal).roam();  
            }

            else if (animal instanceof Elephant) {
                ((Elephant) animal).sprayWater();
            }
            System.out.println();
            // AI code
        }
    }

    // A custom method to simulate the zoo, this makes it much more simpler to use
    // the program and our custom methods

    // This method allows us to utilize polymorphism and the output of these methods
    // will be determined by the animal sub-class
      
    // The AI generated portion uses syntax that is quite sophisticated and I havent
    // seen before, a high level explanation is that the code determines whether the
    // instance of the animal class is a lion or elephant and utilizes there own
    // unique methods accordingly
}