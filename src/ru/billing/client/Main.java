package ru.billing.client;

import ru.billing.exceptions.CatalogLoadException;
import ru.billing.exceptions.ItemAlreadyExistsException;
import ru.billing.stocklist.Category;
import ru.billing.stocklist.FoodItem;
import ru.billing.stocklist.GenericItem;
import ru.billing.stocklist.ItemCatalog;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ItemCatalog catalog = new ItemCatalog();
        try {
            catalog.addItem(new FoodItem("Bread", 89.90f, (short) 3));
            catalog.addItem(new GenericItem("clove", 9f, Category.GENERAL));
            catalog.addItem(new FoodItem("Apple", 15.0f, (short) 10));
            catalog.addItem(new GenericItem("Paper", 6.77f, Category.PRINT));
            catalog.addItem(new GenericItem("Sweater", 100.0f, Category.DRESS));
            catalog.addItem(new FoodItem("Red fish's black children", 400.0f, (short)2));
            catalog.addItem(new GenericItem("Car", 9f, Category.GENERAL));
            catalog.addItem(new GenericItem("Scarf", 29.55f, Category.DRESS));
            catalog.addItem(new FoodItem("Pasta", 59.99f, (short) 15));
        } catch (ItemAlreadyExistsException e) {
            e.printStackTrace();
        }


//        long begin = new Date().getTime();
//
//        for(int i=0; i<100000;i++)
//            catalog.findItemByID(10);
//        long end = new Date().getTime();
//        System.out.println("In HashMap: "+(end-begin)); begin = new Date().getTime();
//        for(int i=0; i<100000;i++)
//            catalog.findItemByIDAL(10);
//        end = new Date().getTime();
//        System.out.println("In ArrayList: "+(end-begin));
//
//        CatalogLoader loader = new CatalogStubLoader();
//        try {
//            loader.load(catalog);
//        } catch (CatalogLoadException e) {
//            e.printStackTrace();
//        }
//        catalog.printItems();

        System.out.println(catalog.findItemByParam(9f, Category.GENERAL));
    }
}
