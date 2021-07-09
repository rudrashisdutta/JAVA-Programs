package learn;
import java.util.Scanner;
import java.io.IOException;
class topper {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    //int t;
    int a,i,b,c,n,d=0;
    Scanner sc= new Scanner(System.in);
    //t= sc.nextInt();
    a= sc.nextInt();
    b= sc.nextInt();
    c= sc.nextInt();
    n= sc.nextInt();
    sc.close();
    for(i=0;i<n;i++)
    {
      d=a+b+c;
      a=b;
      b=c;
      c=d;
    }
  }
}