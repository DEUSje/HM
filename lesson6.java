package HomeWork.lesson6;

public class lesson6 {
        public static void main(String[] args) {
            Cat cat = new Cat("Барсик");
            Dog dog = new Dog("Шар");
            Animal[] arr = new Animal[2];
            arr[0] = cat;
            arr[1] = dog;
            for (int N=0; N<2; N++) {
                arr[N].Run(300);
                arr[N].Swim(5);
            }
    }
}
abstract class Animal {
    String name;
    int RunMaxDistance = 0;
    int SwimMaxDistance = 0;
    public Animal(String name, int RunDistance, int SwimDistance) {
        this.name = name;
        this.RunMaxDistance = RunDistance;
        this.SwimMaxDistance = SwimDistance;
    }
    public void animalInfo() {
        System.out.println("Животное: " + name);
    }
    public void Run(int RunDistance) {
        int TotalRunDistance = (RunMaxDistance>=RunDistance) ? RunDistance : RunMaxDistance;
        System.out.println(name + " пробежал " + TotalRunDistance + "м");
    }
    public void Swim(int SwimDistance) {
        int TotalSwimDistance = (SwimMaxDistance>=SwimDistance) ? SwimDistance : SwimMaxDistance;
        if (SwimMaxDistance == 0) {
            System.out.println(name + " не плавает");
            return;
        }
        System.out.println(name + " проплыл " + TotalSwimDistance + "м");
        }
}
class Cat extends Animal {
    public Cat(String name) {
        super(name, 200, 0);
    }
}
class Dog extends Animal {
    public Dog(String name) {
        super(name, 500, 10);
    }
}
//
