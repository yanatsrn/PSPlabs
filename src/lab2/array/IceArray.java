package lab2.array;

import lab1.ice.entity.IceCream;

public class IceArray {

    public IceCream[] createIceArray() {

        IceCream []iceCreamArray = new IceCream[3];
        iceCreamArray[0] = new IceCream("ТОП со страчателлой", true, (float) 86.2);
        iceCreamArray[1] = new IceCream("Юкки в стаканчике", true);
        iceCreamArray[1].setPercent((float) 89.4);
        iceCreamArray[2] = new IceCream();
        iceCreamArray[2].setName("Каштан");
        iceCreamArray[2].setPercent((float) 92.3);
        return iceCreamArray;
    }

    public void showIceCreamArray(IceCream[] array) {
        if (array != null) {
            for (IceCream iceCream : array) {
                System.out.println(iceCream);
            }
        }
    }

    public float averagePercent(IceCream[] array) {
        int n = 0;
        float percent = 0;
        for (IceCream iceCreamArray : array) {
            percent += iceCreamArray.getPercent();
            n++;
        }
        return (percent / n);
    }

    public int countOfChocolateIceCreams(IceCream[] array) {
        int count = 0;
        for (IceCream iceCreamArray : array) {
            if (iceCreamArray.isChocolate()) {
                count++;
            }
        }
        return count;
    }
}
