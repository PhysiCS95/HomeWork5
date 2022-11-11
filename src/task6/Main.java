package task6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> teachers = new ArrayList<>();
        teachers.add("Puhka Angelika");
        teachers.add("Repey Larisa");
        teachers.add("Mochka Ilona");
        teachers.add("Yashchishena Nina");
        teachers.add("Tuz Volodimir");
        System.out.println("Лучший индекс учителя " + teachers.indexOf("Puhka Angelika"));
        System.out.println("Худший индекс учителя " + teachers.indexOf("Repey Larisa"));
    }
}
