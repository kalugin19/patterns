package com.company;

import com.company.ingredients.Cheese;
import com.company.ingredients.Meat;
import com.company.ingredients.Vegetables;

import java.util.List;

@SuppressWarnings("unused")
public class Pizza {

    private boolean hasMushrooms;

    private boolean isThinDough;

    private boolean hasSalami;

    private List<Meat> meats;

    private List<Cheese> cheeses;

    private List<Vegetables> vegetables;


    public boolean isHasMushrooms() {
        return hasMushrooms;
    }

    public boolean isThinDough() {
        return isThinDough;
    }

    public boolean isHasSalami() {
        return hasSalami;
    }

    public List<Meat> getMeats() {
        return meats;
    }

    public List<Cheese> getCheeses() {
        return cheeses;
    }

    public List<Vegetables> getVegetables() {
        return vegetables;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "hasMushrooms=" + hasMushrooms +
                ", isThinDough=" + isThinDough +
                ", hasSalami=" + hasSalami +
                ", meats=" + meats +
                ", cheeses=" + cheeses +
                ", vegetables=" + vegetables +
                '}';
    }

    static class Builder {

        private final Pizza pizza;

         public Builder() {
             this.pizza = new Pizza();
         }

         public Builder setHasMushooms(boolean hasMushooms) {
             pizza.hasMushrooms = hasMushooms;
            return this;
        }


        public Builder setThinDough(boolean thinDough) {
            pizza.isThinDough = thinDough;
            return this;
        }

        public Builder setHasSalami(boolean hasSalami) {
            pizza.hasSalami = hasSalami;
            return this;
        }


        public Builder setMeats(List<Meat> meats) {
            pizza.meats = meats;
            return this;
        }

        public Builder setCheeses(List<Cheese> cheeses) {
            pizza.cheeses = cheeses;
            return this;
        }

        public Builder setVegetables(List<Vegetables> vegetables) {
            pizza.vegetables = vegetables;
            return this;
        }

        public Pizza build() {
            return pizza;
        }

    }


}
