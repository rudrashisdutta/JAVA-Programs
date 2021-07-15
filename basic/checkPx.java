package basic;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class checkPx {
    public static double calculate(int size, int count) {
        double percentage = 0;
        int trueCondition = 0;
        for (int i = 0; i < count; i++) {
            List<Integer> People = new ArrayList<Integer>(365);
            for (int k = 0; k < 365; k++) {
                People.add(null);
            }
            Random rand = new Random(i + 1);
            for (int j = 0; j < size; j++) {
                int birthDay = (int) (Math.random() * 365);
                if (People.get(birthDay) != null) {
                    trueCondition++;
                    break;
                } else {
                    People.add(birthDay, rand.nextInt());
                }
            }
        }
        percentage = calculatePercentage(trueCondition, count);
        return percentage;
    }

    public static double calculatePercentage(int trueCondition, int simulationCount) {
        double percentage;
        percentage = ((double) trueCondition / (double) simulationCount) * 100.0;
        return percentage;
    }

    public static void main(String[] args) {
        System.out.println(calculate(20, 10000));
    }
}