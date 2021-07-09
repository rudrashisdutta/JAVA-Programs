import java.util.*;
public class randSeed{
    public static void main(String[] args){
        // create random object 
        Random r = new Random(); 
  
        // return the next pseudorandom integer value
        //System.out.println("Random Integer value : "+ r.nextInt());
        long s = 2;
        r.setSeed(s);
        //for (int i = 0 ; i < 2 ; i++) {
        //    System.out.println(r.nextInt());
        //}
        r.setSeed(2);
        //System.out.println(r.nextInt());
        //System.out.println(r.nextInt());
        Random rand= new Random(1234);
        System.out.println(rand.nextInt(2));
        System.out.println(rand.nextInt(6));
        System.out.println(rand.nextInt(2));
        System.out.println(rand.nextInt(6));
        System.out.println(rand.nextInt(5));
        System.out.println(rand.nextInt(6));
        System.out.println(rand.nextInt(5));
        System.out.println(rand.nextInt(6));
        System.out.println(rand.nextInt(5));
        System.out.println(rand.nextInt(6));
        
        for(int i=0;i<0;i++){
            int x=(int)(Math.random()*364);
            if(x==363){
                System.out.print(x);
            }
        }
    }
}