package lab2;

import ru.billing.stocklist.Category;
import ru.billing.stocklist.FoodItem;
import ru.billing.stocklist.GenericItem;
import ru.billing.stocklist.TechicalItem;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
//        GenericItem gi1 = new GenericItem();
//        gi1.ID=1;
//        gi1.name="first";
//        gi1.price=34.0f;
//        GenericItem gi2 = new GenericItem();
//        gi2.ID=2;
//        gi2.name="second";
//        gi2.price=68.0f;
//        GenericItem gi3 = new GenericItem();
//        gi3.ID=3;
//        gi3.name="third";
//        gi3.price=100.08f;
//        gi1.printAll();
//        gi2.printAll();
//        gi3.printAll();
//
//        FoodItem fi = new FoodItem();
//        fi.ID=4; fi.name="fourth"; fi.price=5.55f; fi.type= Category.FOOD; fi.expires=3; fi.dateOfIncome = new Date();
//        fi.printAll();
//        TechicalItem ti = new TechicalItem();
//        ti.ID=5; ti.name="fifth"; ti.price=777.77f; ti.type=Category.PRINT; fi.expires=3; ti.warrantyTime=5;
//        ti.printAll();
        String s = "sdbj      ; vn z   ; nvehrui";
        String [] arr = s.split("[\\s]+;");
        String newS ="";
        for (int i=0; i< arr.length;i++)
            newS +=arr[i];
        System.out.println(newS);

    }
}
