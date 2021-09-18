package lab1;

import lab1.ice.entity.IceCream;

public class Function {

    public void showName(IceCream example) {
        System.out.println("Название: " + example.getName());
    }

    public void showChoc(IceCream example) {
        if (example.isChocolate()) {
            System.out.println("С шоколадом");
        }
        else
            System.out.println("Без шоколада ");
    }

    public static String isChoc(boolean chocolate) {
        if (chocolate) {
            return "С шоколадом";
        }
        else
            return "Без шоколада ";
    }

    public void showPercent(IceCream example) {
        System.out.println("Процент жирности: " + example.getPercent());
    }

    public static void maxPercent(IceCream ex1, IceCream ex2) {
        System.out.println("Максимальный процент жирности: " + Math.max(ex1.getPercent(), ex2.getPercent()));
    }

}
