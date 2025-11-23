package com.rojatech.ch09.designpatterns;

interface Food {
    public String getType();
}

class Pizza implements Food {
    public String getType() {
        return "Someone ordered a Fast Food!";
    }
}

class Cake implements Food {
    public String getType() {
        return "Someone ordered a Dessert!";
    }
}

class FoodFactory {
    public Food getFood(String order) {
        if (order.equalsIgnoreCase("pizza")) {
            return new Pizza();
        } else if (order.equalsIgnoreCase("cake")) {
            return new Cake();
        } else {
            return null;
        }
    }
}

public class FactoryPattern {
    public static void main(String[] args) {

    }
}
