package study.week2.abstraction;

abstract class Animal {

    protected String name;

    // 생성자 (추상 클래스도 생성자를 가질 수 있음)
    public Animal(String name) {
        this.name = name;
    }

    // 추상 메서드: '어떻게' 먹는지는 자식 클래스가 구체적으로 정의해야 함
    abstract void eat();

    // 일반 메서드: 모든 동물이 공통적으로 가지는 구현된 기능
    public void sleep() {
        System.out.println(name + " is sleeping... Zzz...");
    }

    public String getName() {
        return name;
    }
}

// 구체적인 클래스 Dog: Animal 상속 및 추상 메서드 구현
class Dog extends Animal {

    public Dog(String name) {
        super(name); // 부모 생성자 호출 필수
    }

    // 추상 메서드 구현
    @Override
    void eat() {
        System.out.println(name + " (Dog) eats dog food.");
    }

    void bark() {
        System.out.println(name + " says: Woof Woof!");
    }
}

// 구체적인 클래스 Cat: Animal 상속 및 추상 메서드 구현
class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
        // 추상 메서드 구현
    void eat() {
        System.out.println(name + " (Cat) eats fish.");
    }

    void meow() { // Cat만의 기능
        System.out.println(name + " says: Meow!");
    }
}

public class AbstractionEx {

    public static void main(String[] args) {
        // Animal myAnimal = new Animal("???"); // 오류! 추상 클래스는 객체 생성 불가

        // 부모(추상 클래스) 타입으로 자식 객체 참조 (다형성!)
        Animal myDog = new Dog("Buddy");
        Animal myCat = new Cat("Whiskers");

        // 각 객체의 오버라이딩된 eat() 메서드 호출
        myDog.eat();
        myCat.eat();

        // 부모로부터 상속받은 일반 메서드 호출
        myDog.sleep();
        myCat.sleep();

        // 자식 고유 기능 호출 (형변환 필요)
        if (myDog instanceof Dog) {
            ((Dog) myDog).bark();
        }
    }
}