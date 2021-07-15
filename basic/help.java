package basic;

import java.util.ArrayList;
import java.util.List;

public class help {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(300);
        for (int i = 0; i < 300; i++) {
            list.add(null);
        }
        list.set(250, 5);
        System.out.print(list.get(251));
    }
}