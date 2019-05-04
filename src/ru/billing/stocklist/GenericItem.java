package ru.billing.stocklist;

public class GenericItem {
    protected static int currentID = 1;
    protected int ID;
    protected String name;
    protected float price;
    protected Category type = Category.GENERAL;
    protected GenericItem analog;

    public GenericItem(String name, float price, Category type) {
        this.ID = GenericItem.currentID++;
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public GenericItem(String name, float price, GenericItem analog) {
        this.name = name;
        this.price = price;
        this.analog = analog;
    }

    public GenericItem() {}

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Category getType() {
        return type;
    }

    public void setType(Category type) {
        this.type = type;
    }
    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "GenericItem{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", type=" + type +
                '}';
    }

    void printAll(){
        System.out.printf("ID: %d , Name: %-20s , price:%5.2f , category:%s\n",ID,name,price, type);
    }
}
