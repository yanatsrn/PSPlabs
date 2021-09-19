package menu;

import lab1.Function;
import lab1.WriteInfo;
import lab1.ice.entity.IceCream;
import lab2.activities.EmployeeActivitiesImpl;
import lab2.array.IceArray;
import lab2.entities.*;

import java.util.Scanner;

public class MainMenu {

    public static void menu() {
        Scanner in = new Scanner(System.in);
        System.out.print("Номер лабораторной работы: ");
        String choice = in.nextLine();
        switch (choice) {
            case "1":
                lab1();
                break;
            case "2":
                lab2Menu(in);
                break;
            default:
                break;
        }
    }

    public static void lab1() {

        IceCream vanilla = new IceCream();
        IceCream chocolate = new IceCream("Soletto", true);
        IceCream straw = new IceCream("Магнат", true, 97);
        Function iceFunctions = new Function();
        vanilla.setName("Гоша");
        vanilla.setChocolate(false);
        vanilla.setPercent(89);
        chocolate.setPercent(92);
        System.out.println("Раздельный вывод информации");
        iceFunctions.showName(vanilla);
        iceFunctions.showChoc(vanilla);
        iceFunctions.showPercent(vanilla);
        System.out.println("Общий вывод информации");
        WriteInfo info = new WriteInfo();
        info.showInfo(iceFunctions, chocolate);
        Function.maxPercent(vanilla, chocolate);
        info.showInfo(iceFunctions, straw);
    }

    public static void lab2Menu(Scanner input) {

        IceArray array = new IceArray();
        IceCream[] iceCreams;
        System.out.println("Номер части ЛР №2");
        String choice = input.nextLine();
        switch (choice) {
            case "1":
                iceCreams = array.createIceArray();
                array.showIceCreamArray(iceCreams);
                System.out.println("Средний процент жирности: " + array.averagePercent(iceCreams));
                System.out.println("Количество мороженых с шоколадом: "
                        + array.countOfChocolateIceCreams(iceCreams));
                break;
            case "2":
                EmployeeActivitiesImpl employees = new EmployeeActivitiesImpl();
                Accountent accountent = new Accountent("Евгения", "Рублевская",
                        "+375299876655", 29, 1400,
                        "RublEvg22", "765efgvyw");
                Administrator admin = new Administrator();
                admin.setAge(34);
                admin.setName("Лариса");
                admin.setSurname("Лискова");
                admin.setSalary(900);
                admin.setIdOfResetCard(876544);
                admin.setPhone("+375337654488");
                Cashier cashiers = new Cashier("Анастасия", "Вергейчик", "+37254367211", 73);
                cashiers.setAge(31);
                cashiers.setSalary(900);
                Packer packer = new Packer("Антон", "Павлов", "+375445432766");
                packer.setAge(21);
                packer.setSalary(700);
                SecurityGuard securityGuard = new SecurityGuard("Леонид", "Гришкин", "+375442312276", 49, 700, 6);
                System.out.println(accountent.work());
                System.out.println(packer.work());
                System.out.println(securityGuard.work());
                cashiers.activities();
                securityGuard.run();
                securityGuard.showSalary();
                cashiers.showSalary();
                System.out.println(admin.getWeekend());
                System.out.println(cashiers.getWeekend());
                employees.add(accountent);
                employees.add(admin);
                employees.add(cashiers);
                employees.add(securityGuard);
                employees.add(packer);
                System.out.println(employees);
                break;
            default:
                break;
        }
    }

    public static void lab3(Scanner in) {
        System.out.println();
    }

}
