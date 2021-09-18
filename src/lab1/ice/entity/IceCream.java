package lab1.ice.entity;

import lab1.Function;

public class IceCream {
    String name;
    boolean chocolate = false;
    float percent;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isChocolate() {
        return chocolate;
    }

    public void setChocolate(boolean chocolate) {
        this.chocolate = chocolate;
    }

    public float getPercent() {
        return percent;
    }

    public void setPercent(float percent) {
        this.percent = percent;
    }

    public IceCream() {

    }

    public IceCream(String na, boolean choc) {
        name = na;
        chocolate = choc;
    }

    public IceCream(String na, boolean choc, float pro) {
        name = na;
        chocolate = choc;
        percent = pro;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Мороженое \n" +
                "Название: " + name + '\n' +
                Function.isChoc(chocolate) + '\n' +
                "Процент жирности: " + percent;
    }
}
