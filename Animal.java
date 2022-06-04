package FCC_Interview;

// The interface Animal is essentially a contract for all of the classes that will implement it.
// If a class implements the Animal interface, it must implement all of the methods in the interface.
// Interfaces are applied when multiple classes need to share the same methods.
public interface Animal {
    default public String identifyMyself() {
        return "I am a golden retriever.";
    }
}