public class PersonBuilder {
    String name;
    String surname;
    Integer age;
    String address;

    public PersonBuilder setName(String name) {
        if (name == null) {
            throw new IllegalStateException("Человек не может быть без имени");
        } else {
            this.name = name;
            return this;
        }
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age > 100 || age < 0) {
            throw new IllegalArgumentException(" Такого человека не существует ");
        } else {
            this.age = age;
            return this;
        }
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (name == null || surname == null) {
            throw new IllegalStateException("Вы не указали имя и фамилию");
        } else {
            return new Person(this.name,this.surname);
        }
    }
}