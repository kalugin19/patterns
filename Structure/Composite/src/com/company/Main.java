package com.company;

public class Main {

    public static void main(String[] args) {
        Box mainBox = new Box();

        Box box1 = new Box();
        box1.setChildList();

        Box box2 = new Box();
        Box box3 = new Box();

        mainBox.setChildList(box1, box2, box3);

        box1.setChildList(new Headphone(), new Powerbank());
        Box box2_1 = new Box();
        Box box2_2 = new Box();

        box2_1.setChildList(new Keyboard(), new Powerbank(), new Powerbank());
        box2_2.setChildList(new Keyboard(), new Powerbank(), new Headphone(), new Powerbank());
        box2.setChildList(box2_1, box2_2);

        Box box3_1 = new Box();
        box3.setChildList(box3_1);
        Box box3_1_1 = new Box();

        box3_1.setChildList(new Keyboard(), new Keyboard(), new Headphone(), box3_1_1);

        box3_1_1.setChildList(new Headphone());

        System.out.println(mainBox.getPrice());
    }
}
