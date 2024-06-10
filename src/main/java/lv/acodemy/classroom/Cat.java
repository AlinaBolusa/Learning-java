package lv.acodemy.classroom;

public class Cat {

    // Cat fields
    private String name;
    private int age;
    private String breed;
    private String color;
    private double weight;

    // Cat constructor
    public Cat(String name, int age, String breed, String color, double weight) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
        this.weight = weight;
    }

    public Cat() {
    }

    // Cat getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Create method: voice, eat, sleep, walk
    public void voice() {
        System.out.println("Meow!");
    }

    public void eat() {
        System.out.println(name + " Om- nom -nom.");
    }

    public void sleep() {
        System.out.println(name + " Z-z-z-z.");
    }

    public void walk() {
        System.out.println(name + " I`am walking.");
    }
}
