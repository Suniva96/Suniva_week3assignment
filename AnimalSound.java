
class Animal {
    public void makeSound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    @Override
    public void makeSound(){
        System.out.println("Dogs: Bark");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound(){
        System.out.println("Cats: Meow");
    }
}

class Cow extends Animal {
    @Override
    public void makeSound(){
        System.out.println("Cows: Moooooo");
    }
}

public class AnimalSound {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Cow();

        for (Animal a : animals) {
            a.makeSound();
        }
    }
}
