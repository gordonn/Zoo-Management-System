public class Lion extends Animal {
    private String habitat;

    public Lion(String name, int age, String habitat) {
        super("Lion", age, name);
        this.habitat = habitat;
    }

    @Override
    public void makeSound() {
        System.out.println("Roar!");
    }

    public void roam() {
        System.out.println("Lion is roaming");
    }
}