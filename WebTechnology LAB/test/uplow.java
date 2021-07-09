package WebTechJAVA.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class three {
    static String convert(String st)
    {
        StringBuffer str = new StringBuffer(st);
        int ln = str.length();
        for (int i = 0; i < ln; i++) {
            Character c = str.charAt(i);
            if (Character.isLowerCase(c))
                str.replace(i, i + 1,
                            Character.toUpperCase(c) + "");
            else
                str.replace(i, i + 1,
                            Character.toLowerCase(c) + "");
        }
        st = str.toString();
        return st;
    }
    static Scanner key = new Scanner(System.in);
     public static void main(String[] args) throws IOException
    {
        String input, output; 
        System.out.println("Enter Input file name with .txt: ");
        input = key.nextLine();
        System.out.println("Enter output file name with .txt: ");
        output = key.nextLine();
        FileReader fr = new FileReader(input);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(output, true);
            String s;
            while ((s = br.readLine())!=null) { 
                  fw.write(convert(s)); 
              }
              fw.close();
              br.close();
    }
}