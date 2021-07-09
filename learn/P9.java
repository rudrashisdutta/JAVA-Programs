package learn;

import java.io.FileOutputStream;

class FileOutputStreamExample {

    public static void main(String args[]) {

        try {

            FileOutputStream fout = new FileOutputStream("test.txt");

            fout.write(65);
            fout.write((int) 'K');
            fout.write((int) 'I');
            fout.write((int) 'R');
            fout.write((int) 'A');

            fout.close();

            System.out.println("success...");

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}