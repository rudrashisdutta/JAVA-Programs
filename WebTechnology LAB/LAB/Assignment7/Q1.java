package WebTechJAVA.LAB.Assignment7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Two{
    int l,b;
    double area,cost;
    public void Details() throws IOException{
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(is);
        System.out.print("Enter the length of the 2D sheet:\t");
        l = Integer.parseInt(in.readLine());
        System.out.print("Enter the breadth of the 2D sheet:\t");
        b = Integer.parseInt(in.readLine());
    }
    public void disp(){
        area = l*b;
        cost = 40*area;
        System.out.println("The Area:\t"+area+" square feet\nThe cost of the sheet: Rs "+cost);
    }
}
class Three extends Two{
    int h;
    public void Details() throws IOException{
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(is);
        System.out.println("2D sheets can be converted into 3D Boxes just by giving a dimension");
        System.out.print("Enter the height for making 3D Boxes:\t");
        h = Integer.parseInt(in.readLine());
    }
    public void disp(){
        System.out.println("The Volume:\t"+(l*b*h)+" cube feet\nThe cost of the Box:\tRs "+(60*l*b*h));
    }
    public void getMsg() throws IOException{
        super.Details();
        Details();
    }
    public void prtMsg(){
        super.disp();
        disp();
    }
}
class Plastic{
    public static void main(String[] args) throws IOException {
        Three obj = new Three();
        obj.getMsg();
        obj.prtMsg();
    }
}