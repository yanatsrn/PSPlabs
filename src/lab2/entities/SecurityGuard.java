package lab2.entities;

public class SecurityGuard extends Person{

    int idOfRadio;

    public SecurityGuard() {
    }

    public SecurityGuard(String name, String surname, String phone, int age, int salary, int idOfRadio) {
        super(name, surname, phone, age, salary);
        this.idOfRadio = idOfRadio;
    }

    public int getIdOfRadio() {
        return idOfRadio;
    }

    public void setIdOfRadio(int idOfRadio) {
        this.idOfRadio = idOfRadio;
    }

    @Override
    public String toString() {
        return "Охранник\n" +
                "Имя: " + name + '\n' +
                "Фамилия: " + surname + '\n' +
                "Телефон: " + phone + '\n' +
                "Возраст: " + age + '\n'+
                "Зарплата: " + salary + '\n' +
                "id рации: " + idOfRadio + '\n';
    }

    @Override
    public String work() {
        workRoutine = "Охранник " + getName() + " " + getSurname() +
                " сидит за камерами наблюдения";
        return workRoutine;
    }

    @Override
    public String getWeekend() {
        String day = "Охранник " + getName() + " " + getSurname() + " хочет взять выходной на "
                + weekendDay.plusDays(14);
        return day;
    }

    @Override
    public void showSalary() {
        System.out.println("Зарплата охранника: " + getSalary());
    }

    public void run() {
        System.out.println("Охранник " + getSurname() + getName() + " бежит за вором");
    }
}
