package lab2.entities;

public class Administrator extends Person{

    int idOfResetCard;

    public Administrator() {
    }

    public int getIdOfResetCard() {
        return idOfResetCard;
    }

    public void setIdOfResetCard(int idOfResetCard) {
        this.idOfResetCard = idOfResetCard;
    }

    public Administrator(String name, String surname, String phone, int age, int salary,
                         int idOfResetCard) {
        super(name, surname, phone, age, salary);
        this.idOfResetCard = idOfResetCard;
    }

    @Override
    public String toString() {
        return "Администратор\n" +
                "Имя: " + name + '\n' +
                "Фамилия: " + surname + '\n' +
                "Телефон: " + phone + '\n' +
                "Возраст: " + age + '\n'+
                "Зарплата: " + salary + '\n'+
                "id карты отмены: " + idOfResetCard + '\n';
    }

    @Override
    public String work() {
        workRoutine = "Администратор " + getName() + " " + getSurname() +
                " следит за порядком в зале";
        return workRoutine;
    }

    @Override
    public String getWeekend() {
        String day = "Администратор " + getName() + " " + getSurname() + " хочет взять выходной на "
                + weekendDay.plusDays(10);
        return day;
    }

    @Override
    public void showSalary() {
        System.out.println("Зарплата администратора: " + getSalary());
    }
}
