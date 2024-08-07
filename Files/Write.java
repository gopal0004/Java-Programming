package Files;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Write {
    public static void main(String[] args) {

        try {
            // OutputStream os = System.out;
            OutputStreamWriter osw = new OutputStreamWriter(System.out);
            osw.write("Gopal");
            osw.write("\n");
            osw.write(123);
            osw.write("\n");
            osw.write(97);
            osw.write(10);
            osw.write("\n");
            osw.write(1115);
            char[] arr="Hello, World".toCharArray();
            osw.write(arr);
            osw.write("\n");
            osw.flush();
            osw.close();
            // System.out.println();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        //writing to a file
        try {
            FileWriter fw = new FileWriter("read1.txt",true);
            fw.append("\nThis Should be appended");
            fw.flush();
            fw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //By BufferedWriter write inti file
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("read1.txt",true));
            bw.append("From BufferedWriter");
            bw.newLine();
            bw.append("New Line without slash n");
            bw.flush();
            bw.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
