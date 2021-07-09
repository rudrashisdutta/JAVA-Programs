package WebTechJAVA.LAB.Assignment8;

abstract class Student {
    int roll, regd;

    abstract void course();
}

class Kiitian extends Student {
    void course() {
        System.out.println("Course : B.Tech.");
    }

    public static void main(String args[]) {
        Student student = new Kiitian();
        student.course();
    }
}