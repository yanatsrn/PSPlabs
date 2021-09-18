package lab2.entities;

public class Cashier extends Person{

    long idOfProductsBook;

    public Cashier() {
    }

    public Cashier(String name, String surname, String phone, long idOfProductsBook) {
        super(name, surname, phone);
        this.idOfProductsBook = idOfProductsBook;
    }

    public Cashier(String name, String surname, String phone, int age, int salary, long idOfProductsBook) {
        super(name, surname, phone, age, salary);
        this.idOfProductsBook = idOfProductsBook;
    }

    public long getIdOfProductsBook() {
        return idOfProductsBook;
    }

    public void setIdOfProductsBook(long idOfProductsBook) {
        this.idOfProductsBook = idOfProductsBook;
    }

    @Override
    public String toString() {
        return "Кассир\n" +
                "Имя: " + name + '\n' +
                "Фамилия: " + surname + '\n' +
                "Телефон: " + phone + '\n' +
                "Возраст: " + age + '\n'+
                "Зарплата: " + salary + '\n'+
                "id книги с наименованиями: " + idOfProductsBook + '\n';
    }

    @Override
    public String work() {
        workRoutine = "Кассир " + getName() + " " + getSurname() + " находится на кассе";
        return workRoutine;
    }

    @Override
    public String getWeekend() {
        String day = "Кассир " + getName() + " " + getSurname() +
                " хочет взять выходной на " + weekendDay.plusDays(6);
        return day;
    }

    @Override
    public void showSalary() {
        System.out.println("Зарплата кассира: " + getSalary());
    }
}
