package _17_Inheritance;

public class Animal {
    private String animalName;
    private int animalAge;

    public Animal() {
    }

    public Animal(String animalName, int animalAge) {
        this.animalName = animalName;
        this.animalAge = animalAge;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    public void move() {
        System.out.println("움직입니다.");
    }

    public void showInfo() {
        System.out.println("이름: " + animalName);
        System.out.println("나이: " + animalAge);
    }
}
