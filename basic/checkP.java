import java.util.Random;
import java.util.ArrayList;
import java.util.List;
public class checkP {
    public static double calculate(int size, int count) {

        //add your code here
        double percentage;
        int trueCondition=0;
        for(int i=0;i<count;i++){
            List<Integer> People= new ArrayList<Integer>();
            Random rand=new Random();
            for(int j=0;j<size;j++){
                People.add(rand.nextInt());
                if(check(People)==1){
                    trueCondition++;
                    break;
                }
            }
        }
        percentage=calculatePercentage(trueCondition,count);
        return percentage;
    }

    //add your code here
    public static int check(List<Integer> aList){
        int flagValue=0;
        int last=aList.get(aList.size()-1);
        for(int i=0;i<aList.size()-1;i++){
            if(last==aList.get(i)){
                flagValue=1;
                break;
            }
        }
        return flagValue;
    }
    public static double calculatePercentage(int trueCondition,int size){
        double percentage;
        percentage=((double) trueCondition / (double) size)*100.0;
        return percentage;
    }
    public static void main(String[] arg){
        System.out.println(calculate(500, 10000));
    }
}




/*
Understood the program totally wrong..

There are two random variables.
First one is the days one-> 0-353

The second one is->
The seeded Random values are'nt the b'days.
They are Unique people.



Possible Conclusion-> seeded Random sequences Do not have duplicate values in them.
*/