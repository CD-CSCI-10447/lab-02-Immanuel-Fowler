package edu.desu.poly;

interface Animal{
    void eat();
    void run();
    void walk();
    void makenoise();
    
}

class Lion implements Animal{
    public void eat() {
        System.out.println("The lion has eaten its prey");
    }
    public void run() {
        System.out.println("The lion is running ver fast");
    }
    public void walk() {
        System.out.println("The lion is walking confidently");
    }
    public void makenoise() {
        System.out.println("The lion roars very loudy");
    }

}
class Dog implements Animal{
    public void eat() {
        System.out.println("The dog has eaten the food its owner has left out");
    }
    public void run() {
        System.out.println("The dog is chasing its tail");
    }
    public void walk() {
        System.out.println("The dog is happily trotting along");
    }
    public void makenoise() {
        System.out.println("The dog barks");
    }

}
public class Main {
    public static void main(String[] args) {
        Dog Spot = new Dog();
        Lion Mufassa = new Lion();

        Spot.walk();
        Mufassa.eat();
    }
}
