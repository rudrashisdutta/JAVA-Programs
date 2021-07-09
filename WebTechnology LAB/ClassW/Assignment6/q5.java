package WebTechJAVA.ClassW.Assignment6;

class Student {
    int rollno;
    String name;

    void insertRecord(int r, String n) {
        rollno = r;
        name = n;
    }

    void displayInformation() {
        System.out.println(rollno + " " + name);
    }

    public static void main(String args[]) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.insertRecord(2508, "Rudrashis");
        s2.insertRecord(2811, "Pooja");
        s1.displayInformation();
        s2.displayInformation();
    }
}