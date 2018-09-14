public class Dog extends Animal implements Comparable<Dog> {

    private String name;
    private int numLegs;

    public Dog(String name, int numLegs) {
	this.name = name;
	this.numLegs = numLegs;
    }

    public int getLegs() {
	return numLegs;
    }

    public String getName() {
	return name;
    }

    @Override
    public String toString() {
	return name + " has " + numLegs + " legs.";
    }

    @Override
    public int compareTo(Dog dog) {
	return name.compareTo(dog.getName());
    }
}