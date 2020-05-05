package com.senla.dobrov.task6;

import java.util.Collections;
import java.util.List;

/*
Имеется набор вещей, которые необходимо поместить в рюкзак. Рюкзак обладает заданной грузоподъемностью.
Вещи в свою очередь обладают двумя параметрами — весом и стоимостью.
Цель задачи заполнить рюкзак не превысив его грузоподъемность и максимизировать суммарную ценность груза.
 */
public class BackpackCollector {


    public BackpackCollector() {

    }

    public Backpack GetMostValuableBackpackFromItemList(Backpack backpack, List<Item> items) {
        Collections.sort(items, new ProportionValueComparator());
        for (Item item : items) {
            backpack.addItem(item);
        }
        return backpack;
    }
}
