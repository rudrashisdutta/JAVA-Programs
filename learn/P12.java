package learn;

import java.io.FileInputStream;

class DataStreamExample {

    public static void main(String args[]) {

        try {

            FileInputStream fin = new FileInputStream("./learn/test1.txt");

            int i = fin.read();

            System.out.print((char) i);
            fin.skip(5);
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
            fin.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}