package org.lessons;

public class Dog implements AnimalSounds {
    public static void main(String[] args) {
        Dog Tommy = new Dog();
        Tommy.makeSound();
    }
    public void makeSound() {
        System.out.println("Bow! Bow!");
    }
}
