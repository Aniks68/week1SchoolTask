package Models;

public abstract class Person {
    private String name;
    private static int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    protected Person() {
    }

    public String getName() {
        return name;
    }

    public static int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name = '" + name + '\'' +
                "age = '" + age + '\'' +
                ", address = '" + address + '\'' +
                '}';
    }
}
