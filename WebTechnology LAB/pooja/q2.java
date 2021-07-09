package WebTechJAVA.pooja;

class Sport {

    Sport(){
        System.out.println("\nThis is base class constructor\n");
    }
    void favouriteSports(){
        System.out.println("Kabbadi is my favourite sport");
    }
}
class Person1 extends Sport{
    Person1(){
        super();
    }
    void sports(){
        System.out.println("This is subclass method");
    }
}
class Person2{
    public static void main(String[] args) {
        Person1 p = new Person1();
        p.sports();
    }
}