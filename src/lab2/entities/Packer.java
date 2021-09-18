package lab2.entities;

public class Packer extends Person{

    public Packer() {
    }

    public Packer(String name, String surname, String phone) {
        super(name, surname, phone);
    }

    public Packer(String name, String surname, String phone, int age, int salary) {
        super(name, surname, phone, age, salary);
    }

    @Override
    public String toString() {
        return "Фасовщик\n" +
                "Имя: " + name + '\n' +
                "Фамилия: " + surname + '\n' +
                "Телефон: " + phone + '\n' +
                "Возраст: " + age + '\n'+
                "Зарплата: " + salary + '\n';
    }

    @Override
    public String work() {
        workRoutine = "Фасовщик " + getName() + " " + getSurname() +
                " сидит на складе";
        return workRoutine;
    }

    @Override
    public String getWeekend() {
        String day = "Фасовщик " + getName() + " " + getSurname() + " хочет взять выходной на "
                + weekendDay.plusDays(1);
        return day;
    }

    @Override
    public void showSalary() {
        System.out.println("Зарплата фасовщика: " + getSalary());
    }
}
