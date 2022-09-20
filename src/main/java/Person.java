import java.util.Objects;

public class Person {
    final String name;
    final String surname;
    Integer age;
    String address;


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public boolean hasAge() {
        return this.age != null;
    }

    public boolean hasAddress() {
        return this.address != null;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        System.out.println("Выпьем за:  " + getSurname() + getName() + "С ДР ");
        if (hasAge()) {
            age++;
        }
    }

    @Override
    public String toString() {
        return " Товарищ " + name + " " + surname + " " + address + " " + age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, address);
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(this.surname)
                .setAddress(this.address);
    }
}