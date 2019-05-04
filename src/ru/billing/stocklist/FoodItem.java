package ru.billing.stocklist;

import java.util.Date;

public class FoodItem extends GenericItem {
    private Date dateOfIncome; // дата производства
    private short expires; //срок годности

    public FoodItem(String name, float price, FoodItem foodItem, Date date, short expires) {
        //TODO инкапсулировать поля базового класса, скрыть
//        super(name, price);
        this.ID = GenericItem.currentID++;
        this.name = name;
        this.price = price;
        this.analog = foodItem;
        this.dateOfIncome = date;
        this.expires = expires;
        this.type = Category.FOOD;
    }

    public FoodItem(String name, float price, short expires) {
        this(name, price, null, new Date(), expires);
    }

    public FoodItem(String name) {
        this(name, 0.0f, (short) 0);
    }

    public FoodItem() {

    }

    @Override
    public void printAll() {
        super.printAll();
        System.out.println("Дата производства: " + dateOfIncome.toString() + " срок годности " + expires);
    }
}
