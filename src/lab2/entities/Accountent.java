package lab2.entities;

public class Accountent extends Person{

    String loginAccount;
    String passwordAccount;

    public Accountent() {
    }

    public Accountent(String name, String surname, String phone, int age, int salary,
                      String loginAccount, String passwordAccount) {
        super(name, surname, phone, age, salary);
        this.loginAccount = loginAccount;
        this.passwordAccount = passwordAccount;
    }

    public String getLoginAccount() {
        return loginAccount;
    }

    public void setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount;
    }

    public String getPasswordAccount() {
        return passwordAccount;
    }

    public void setPasswordAccount(String passwordAccount) {
        this.passwordAccount = passwordAccount;
    }

    @Override
    public String toString() {
        return "Бухгалтер\n" +
                "Логин от рабочего аккаунта: " + loginAccount + '\n' +
                "Пароль от рабочего аккаунта: " + passwordAccount + '\n' +
                "Имя: " + name + '\n' +
                "Фамилия: " + surname + '\n' +
                "Телефон: " + phone + '\n' +
                "Возраст: " + age + '\n'+
                "Зарплата: " + salary + '\n';
    }

    @Override
    public String work() {
        workRoutine = "Бухгалтер " + getName() + " " + getSurname() + " работает над отчетом";
        return workRoutine;
    }

    @Override
    public String getWeekend() {
        String day = "Бухгалтер " + getName() + " " + getSurname() +
                " хочет взять выходной на " + weekendDay.plusDays(2);
        return day;
    }

    @Override
    public void showSalary() {
        System.out.println("Зарплата бухгалтера: " + getSalary());
    }
}
