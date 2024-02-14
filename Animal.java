class Animal {
    protected String species;
    protected int age;
    protected String name;

    // Protected variables, are variables that are visible only to the class to which they belong, and any subclasses (extended classes).

    public Animal(String species, int age, String name) {
        this.species = species;
        this.age = age;
        this.name = name;
    }

    // Constructor for the animal class
    // this. refers to the current object in the method or constructor

    public void makeSound() {
        System.out.println("Animal sound");
    }

    // A method simulating animal noises

    public void eat() {
        System.out.println("Animal is eating");
    }

    // A method simulating eating

    public void sleep() {
        System.out.println("Animal is sleeping");
    }

    // A method simulating sleeping
}