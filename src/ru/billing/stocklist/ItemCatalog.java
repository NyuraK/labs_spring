package ru.billing.stocklist;

import javafx.util.Pair;
import ru.billing.exceptions.ItemAlreadyExistsException;

import java.util.ArrayList;
import java.util.HashMap;

public class ItemCatalog {
    private HashMap<Integer, GenericItem> catalog =
            new HashMap<Integer,GenericItem>();
    private ArrayList<GenericItem> ALCatalog = new ArrayList<GenericItem>();

    private HashMap<Pair<Category, Float>, ArrayList<GenericItem>> modified_catalog =
            new HashMap<Pair<Category, Float>, ArrayList<GenericItem>>();

    public void addItem(GenericItem item) throws ItemAlreadyExistsException{
        if (catalog.containsValue(item) || ALCatalog.contains(item))
            throw new ItemAlreadyExistsException();
        catalog.put(item.getID(), item); // Добавляем товар в HashMap
        ALCatalog.add(item); // Добавляем тот же товар в ArrayList
            ArrayList<GenericItem> temp = modified_catalog.computeIfAbsent(new Pair<>(item.type, item.price), K->new ArrayList<>());
            temp.add(item);
            modified_catalog.put(new Pair<>(item.type, item.price), temp);
    }

    public void printItems(){
        for(GenericItem i : ALCatalog){
            System.out.println(i);
        }
    }

    public GenericItem findItemByID(int id){
        if(!catalog.containsKey(id)) {
            return null;
        } else{
            return catalog.get(id);
        }
    }

    public GenericItem findItemByIDAL(int id){
        for(GenericItem i : ALCatalog){
            if(i.getID()==id) return i;
        }
        return null;
    }

    public ArrayList<GenericItem> findItemByParam(Float price, Category type){
        if(!modified_catalog.containsKey(new Pair<>(type, price))) {
            return null;
        } else {
            return modified_catalog.get(new Pair<>(type, price));
        }
    }

}
