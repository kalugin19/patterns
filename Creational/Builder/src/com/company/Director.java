package com.company;

import com.company.ingredients.Cheese;
import com.company.ingredients.Meat;
import com.company.ingredients.Vegetables;

import java.util.ArrayList;
import java.util.List;

class Director {

    Pizza.Builder constructMargherita() {
        Pizza.Builder builder = new Pizza.Builder();
        List<Cheese> cheeses = new ArrayList<>();
        cheeses.add(Cheese.MOZZARELLA);
        return builder
                .setCheeses(cheeses)
                .setHasMushooms(false)
                .setThinDough(true)
                .setHasSalami(true);
    }

    Pizza.Builder constructNeapolitano() {
        Pizza.Builder builder = new Pizza.Builder();
        List<Cheese> cheeses = new ArrayList<>();
        List<Meat> meats = new ArrayList<>();
        List<Vegetables> vegetables = new ArrayList<>();
        vegetables.add(Vegetables.BASIL);
        vegetables.add(Vegetables.OLIVES);
        vegetables.add(Vegetables.TOMATOES);
        meats.add(Meat.ANCHOUSE);
        cheeses.add(Cheese.MOZZARELLA);
        cheeses.add(Cheese.PARMESAN);
        return builder
                .setCheeses(cheeses)
                .setHasMushooms(true)
                .setThinDough(true)
                .setHasSalami(false)
                .setMeats(meats)
                .setVegetables(vegetables);
    }
}
