package lab1;

import lab1.ice.entity.IceCream;

public class WriteInfo {

    public void showInfo(Function function, IceCream iceCream){
        function.showName(iceCream);
        function.showChoc(iceCream);
        function.showPercent(iceCream);
    }

}
