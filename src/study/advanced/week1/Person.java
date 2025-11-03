package study.advanced.week1;

public class Person {

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("이름은 비워둘 수 없습니다.");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("유효하지 않은 나이입니다.");
        }
    }

    public void sayHello() {
        System.out.println("안녕하세요. 저는 " + name + "입니다. 나이는 " + age + "입니다.");
    }

    public static void main(String[] args) {
        Person person1 = new Person();

        person1.setName("김익명");
        person1.setAge(25);

        System.out.println("이름: " + person1.getName());
        System.out.println("나이: " + person1.getAge());

        person1.sayHello();

        System.out.println("-----");

        Person person2 = new Person("박익명", 30);
        person2.sayHello();

        person2.setAge(200);
        person2.setName("");
        person2.sayHello();
    }
}
