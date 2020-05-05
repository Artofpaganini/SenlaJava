package com.senla.dobrov.task6;

import java.util.ArrayList;
import java.util.List;

/*
Имеется набор вещей, которые необходимо поместить в рюкзак. Рюкзак обладает заданной грузоподъемностью.
Вещи в свою очередь обладают двумя параметрами — весом и стоимостью.
Цель задачи заполнить рюкзак не превысив его грузоподъемность и максимизировать суммарную ценность груза.
 */
public class Backpack {
    private final int maxWeight;
    private int currentWeight;
    private double currentValue;
    private List<Item> items = new ArrayList<Item>();

    public Backpack(int maxWeight, List<Item> items) {
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
        this.currentValue = 0;
        for (Item item : items) {
            addItem(item);
        }
    }

    public boolean addItem(Item item) {
        if ((currentWeight + item.getWeight()) > maxWeight) {
            return false;
        } else {
            items.add(item);
            currentWeight += item.getWeight();
            currentValue += item.getValue();
            return true;
        }
    }

    public List<Item> getItems() {
        return items;
    }


    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Backpack. Max weight = " + maxWeight + ", current weight = "
                + currentWeight + ", current value = " + currentValue + "\n");
        for(Item item :items){
            str.append(item.toString()+"\n");
        }
        return str.toString();
    }
}
