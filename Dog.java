package FCC_Interview;

// The class Dog was created by implementing the Animal interface.
public class Dog implements Animal {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.identifyMyself());
        System.out.println("Did the dog fetch the stick? " + dog.fetch());
    }

    // A method where the dog plays fetch and has a 50/50 chance of bringing back a
    // stick.
    public boolean fetch() {
        if (Math.random() > 0.5) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String identifyMyself() {
        return "I am a german shepard.";
    }
}
