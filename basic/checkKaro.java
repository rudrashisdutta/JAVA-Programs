package basic;

public class checkKaro {
    public static void main(String[] args) {
         String x="20",y="2147483648";
         System.out.println((x.charAt(0)+"").equals(3+""));
         int d;
         try {
             d=Integer.valueOf(y);
         } catch (Exception e) {
             System.out.println("Not in range");
         }
    }
}