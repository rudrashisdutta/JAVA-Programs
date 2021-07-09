package learn;

class qqq {
    public static void main(String[] args) {
        String x = "foo";
        Object o = (Object) x;
        if (x.equals(o)) {
            System.out.print(x);
        }
        if (o.equals(x)) {
            System.out.print(x + "looal");
        }
    }
}