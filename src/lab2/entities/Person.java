package lab2.entities;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Person {

    public static String workRoutine = " ";
    public static LocalDate weekendDay = LocalDate.now();

    String name;
    String surname;
    String phone;
    int age;
    int salary;

    public Person() {
    }

    public Person(String name, String surname, String phone) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }

    public Person(String name, String surname, String phone, int age, int salary) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && salary == person.salary && Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname) && Objects.equals(phone, person.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, phone, age, salary);
    }

    public abstract String work();

    public abstract String getWeekend();

    public abstract void showSalary();

}
