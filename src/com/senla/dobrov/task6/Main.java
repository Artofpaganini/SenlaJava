package com.senla.dobrov.task6;

import java.util.ArrayList;
import java.util.List;

/*
Имеется набор вещей, которые необходимо поместить в рюкзак. Рюкзак обладает заданной грузоподъемностью.
Вещи в свою очередь обладают двумя параметрами — весом и стоимостью.
Цель задачи заполнить рюкзак не превысив его грузоподъемность и максимизировать суммарную ценность груза.
 */

public class Main {
    public static void main(String[] args) {
        Backpack backpack = new Backpack(15, java.util.Collections.emptyList());
        List<Item> items = new ArrayList<>();
        items.add(new Item("Item1", 5, 20));
        items.add(new Item("Item2", 6, 20));
        items.add(new Item("Item3", 2, 100));
        items.add(new Item("Item4", 10, 25));
        items.add(new Item("Item5", 7, 30));

        BackpackCollector backpackCollector = new BackpackCollector();
        backpackCollector.GetMostValuableBackpackFromItemList(backpack, items);
        System.out.println("List to pick items:");

        for (Item item : items) {
            System.out.println(item.toString());
        }
        System.out.println();
        System.out.print(backpack.toString());
    }
}

