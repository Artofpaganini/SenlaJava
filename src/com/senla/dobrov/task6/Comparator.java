package com.senla.dobrov.task6;


import java.util.Comparator;

/*
Имеется набор вещей, которые необходимо поместить в рюкзак. Рюкзак обладает заданной грузоподъемностью.
Вещи в свою очередь обладают двумя параметрами — весом и стоимостью.
Цель задачи заполнить рюкзак не превысив его грузоподъемность и максимизировать суммарную ценность груза.
 */

class ProportionValueComparator implements Comparator<Item> {

    public int compare(Item o1, Item o2) {
        double proportionValue1 = o1.getValue() / o1.getWeight();
        double proportionValue2 = o2.getValue() / o2.getWeight();
        int intPropValue1 = (int) Math.round(proportionValue1 * 10000);
        int intPropValue2 = (int) Math.round(proportionValue2 * 10000);
        return (intPropValue2 - intPropValue1);
    }
}
