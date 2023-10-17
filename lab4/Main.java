package lab4;

class Person {
    private String fullName;
    private int age;

    // Конструктор без параметров
    public Person() {
        this.fullName = "Amogus";
        this.age = 0;
    }

    // Конструктор с параметрами
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    // Метод для перемещения
    public void move() {
        System.out.println(fullName + " перемещается.");
    }

    // Метод для разговора
    public void talk() {
        System.out.println(fullName + " говорит.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Создание объекта с конструктором без параметров
        Person person1 = new Person();

        // Создание объекта с конструктором с параметрами
        Person person2 = new Person("Паша Керп", 30);

        // Вызов методов для каждого объекта
        person1.move();
        person1.talk();

        person2.move();
        person2.talk();
    }
}







