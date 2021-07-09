package learn;

import java.io.FileOutputStream;

class FileOutputStreamExample2 {

    public static void main(String args[]) {

        try {

            FileOutputStream fout = new FileOutputStream("./learn/test1.txt");

            String str = "AKIRA IS MOTI!";
            byte[] strB = str.getBytes();
            fout.write(strB);

            fout.close();

            System.out.println("success...");

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}