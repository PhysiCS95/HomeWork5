package task4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);

        ListIterator<Integer> iterator = numbers.listIterator();
        while (iterator.hasNext()) {
            Integer integer = iterator.next() + 1;
            System.out.println(integer);
        }
    }
}
