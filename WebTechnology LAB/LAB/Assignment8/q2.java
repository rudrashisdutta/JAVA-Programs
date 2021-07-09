package WebTechJAVA.LAB.Assignment8;

interface Motor{
    final static int capacity=20;
    public void run(int time);
    public void consume(int units);
}
class Washing_Machine implements Motor{
    public void run(int time){
        System.out.println("The machine ran for only " + time + " hours.");
    }
    public void consume(int units){
        System.out.println("The machine has consumed " + units + " units of electricity.");
    }
}
public class q2{
	public static void main(String[] args){
	    Washing_Machine washing_Machine = new Washing_Machine();
		System.out.println(Motor.capacity);
		washing_Machine.run(10);
		washing_Machine.consume(600);
	}
}