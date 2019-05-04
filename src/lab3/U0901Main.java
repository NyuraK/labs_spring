package lab3;

import ru.billing.stocklist.FoodItem;

public class U0901Main {
    public static void main(String[] args) {
        Integer intArr[]={10,20,15};
        Float floatArr[] = new Float[4];
        int i=0;
        while (i<4){
            floatArr[i] = (float)i+10*3/8;
            i++;
        }
        U0901WorkArray insWorkArrayInt = new U0901WorkArray(intArr);
        U0901WorkArray insWorkArrayFloat = new U0901WorkArray(floatArr);
        System.out.println(insWorkArrayInt.sum());
        System.out.println(insWorkArrayFloat.sum());

        //Упражнение 3-1
        String line = "Конфеты ’Маска’;45;120";
        String[] item_fld = line.split(";");
        FoodItem foodItem =
                new FoodItem(item_fld[0], Float.valueOf(item_fld[1]), Short.valueOf(item_fld[2]));
        foodItem.printAll();
    }

}
