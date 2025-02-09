package SealedClass;

// Parent class: Sealed class allows only Dog and Cat to extend it
sealed class Animal permits Dog, Cat {  
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Allowed child class: Dog (Final - Cannot be extended further)
final class Dog extends Animal {  
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Allowed child class: Cat (Non-Sealed - Can be extended freely)
non-sealed class Cat extends Animal {  
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

// New child class extending Cat (Allowed since Cat is non-sealed)
class PersianCat extends Cat {  
    @Override
    void makeSound() {
        System.out.println("Persian Cat meows softly");
    }
}

public class SealedEx {
    public static void main(String[] args) {
        Animal myCat = new Cat();
        myCat.makeSound();  // Output: Cat meows

        Animal myPersianCat = new PersianCat();
        myPersianCat.makeSound();  // Output: Persian Cat meows softly
        
        Dog dog=new Dog();
        dog.makeSound();
    }
}
