package com.senla.dobrov.task6;
/*
Имеется набор вещей, которые необходимо поместить в рюкзак. Рюкзак обладает заданной грузоподъемностью.
Вещи в свою очередь обладают двумя параметрами — весом и стоимостью.
Цель задачи заполнить рюкзак не превысив его грузоподъемность и максимизировать суммарную ценность груза.
 */


public class Item {
    private String name;
    private int weight;
    private double value;

    public Item(String name, int weight, double value) {
        setName(name);
        setWeight(weight);
        setValue(value);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public double getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        if (weight < 0) weight = 1;
        this.weight = weight;
    }

    public void setValue(double value) {
        if (value < 0) value = 0;
        this.value = value;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Item { name - " + this.name + ", weight - " +
                this.weight + ", value - " + this.value + " }");
        return str.toString();
    }
}
