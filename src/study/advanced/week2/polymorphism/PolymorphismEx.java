package study.advanced.week2.polymorphism;

class Animal {

    String name;

    void eat() {
        System.out.println(name + "이(가) 음식을 먹습니다.");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println(name + "이(가) 멍멍 짖습니다.");
    }

    @Override
    void eat() {
        System.out.println(name + "이(가) 사료를 먹습니다.");
    }
}

class Cat extends Animal {

    void meow() {
        System.out.println(name + "이(가) 야옹~");
    }

    @Override
    void eat() {
        System.out.println(name + "이(가) 생선을 먹습니다.");
    }
}

public class PolymorphismEx {

    public static void main(String[] args) {
        Animal myPet = new Dog();
        myPet.name = "멍멍이";
        myPet.eat();
        // myPet.bark(); // 컴파일 오류! Animal 타입 변수로는 Dog에만 있는 bark()를 직접 호출 불가

        System.out.println("--------------------");

        myPet = new Cat();
        myPet.name = "나비";
        myPet.eat();
        // myPet.meow(); // 컴파일 오류! Animal 타입 변수로는 Cat에만 있는 meow()를 직접 호출 불가

        System.out.println("--------------------");

        // 다형성의 활용: 객체 배열 관리
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[0].name = "보리";
        animals[1] = new Cat();
        animals[1].name = "치즈";
        animals[2] = new Dog();
        animals[2].name = "해피";

        System.out.println("모든 동물 밥 주기:");
        for (Animal animal : animals) {
            animal.eat();
        }

        System.out.println("--------------------");

        System.out.println("개는 짖고 고양이는 울어봐:");
        for (Animal animal : animals) {
            if (animal instanceof Dog) { // 이 객체가 Dog 타입이 맞는지 확인
                Dog specificDog = (Dog) animal; // 맞으면 Dog 타입으로 강제 형변환
                specificDog.bark();
            } else if (animal instanceof Cat) { // 이 객체가 Cat 타입이 맞는지 확인
                Cat specificCat = (Cat) animal; // 맞으면 Cat 타입으로 강제 형변환
                specificCat.meow();
            }
        }
    }
}
