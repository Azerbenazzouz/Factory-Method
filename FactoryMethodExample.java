// Interface Product
interface Product {
    void use();
}

// Classes concrètes implémentant Product
class ConcreteProductA implements Product {
    public void use() {
        System.out.println("Using Product A");
    }
}

class ConcreteProductB implements Product {
    public void use() {
        System.out.println("Using Product B");
    }
}

// Classe créatrice abstraite
abstract class Creator {
    // Méthode Factory
    public abstract Product factoryMethod();

    public void someOperation() {
        Product product = factoryMethod();
        product.use();
    }
}

// Créateurs concrets
class ConcreteCreatorA extends Creator {
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}

class ConcreteCreatorB extends Creator {
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}

// Classe client
public class FactoryMethodExample {
    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        creatorA.someOperation(); // Output: Using Product A

        Creator creatorB = new ConcreteCreatorB();
        creatorB.someOperation(); // Output: Using Product B
    }
}
