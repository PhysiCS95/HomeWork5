package task5;

import java.util.ArrayList;
import java.util.Collections;

public class Friends {
    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();
        friends.add("Yaroslav");
        friends.add("Bogdan");
        friends.add("Andrey");
        friends.add("Pasha");
        System.out.println(friends);
        Collections.sort(friends);
        System.out.println(friends);
    }
}
