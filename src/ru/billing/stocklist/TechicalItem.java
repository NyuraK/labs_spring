package ru.billing.stocklist;

import ru.billing.stocklist.GenericItem;

public class TechicalItem extends GenericItem {
    private short warrantyTime;

    @Override
    void printAll() {
        super.printAll();
        System.out.println("Гарантийный срок " + warrantyTime);
    }
}
