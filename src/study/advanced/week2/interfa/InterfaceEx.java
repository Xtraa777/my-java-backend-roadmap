package study.advanced.week2.interfa;

interface Flyable {

    void fly(); // 추상 메서드 (public abstract 생략 가능)
    // int MAX_SPEED = 700; // 상수 정의 가능 (public static final 생략 가능)
}

class Bird implements Flyable {

    private String type;

    public Bird(String type) {
        this.type = type;
    }

    @Override
    public void fly() {
        System.out.println(type + " bird is flying high!");
    }
}

class Airplane implements Flyable {

    private String model;

    public Airplane(String model) {
        this.model = model;
    }

    @Override
    public void fly() {
        System.out.println(model + " airplane is flying fast!");
    }
}

public class InterfaceEx {

    public static void main(String[] args) {

        Flyable flyer1 = new Bird("Eagle");
        Flyable flyer2 = new Airplane("Boeing 747");

        flyer1.fly();
        flyer2.fly();

        // Flyable flyer3 = new Flyable(); // 인터페이스는 객체 생성 불가
    }
}
