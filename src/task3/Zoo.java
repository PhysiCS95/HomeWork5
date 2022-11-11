package task3;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add(0, "Bear");
        animals.add(1, "Wolf");
        animals.add(2, "Fox"); //3
        animals.add(3, "Boar");
        animals.add(4, "Raccoon"); //5
        animals.add(5, "Beaver");
        animals.add(6, "Lion"); //7
        animals.add(7, "Tiger");

        animals.remove(2);
        animals.remove(3);
        animals.remove(4);
        System.out.println(animals);
        System.out.println(animals.size());
    }
}
