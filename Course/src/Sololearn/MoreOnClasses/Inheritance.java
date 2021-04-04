package Sololearn.MoreOnClasses;

class Animal {
    public void makeSound() {
        System.out.println("Hi");
    }
}

class Dog extends Animal {
}

class Inheritance {
    public static void main(String [] args) {
        Dog dog = new Dog();
        dog.makeSound();
    }
}