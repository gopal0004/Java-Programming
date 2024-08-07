package Practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class File1 {
    public static void main(String[] args) {
        
        // open a file
        try{
            File fo = new File("Exam1.txt");
            fo.createNewFile();
        }catch (IOException e){
            System.out.println("File opening");
        }

        //write to the file
        try{
            FileWriter fw = new FileWriter("Exam1.txt",true);
            fw.write("\n Jay Dwarkadhis");
            fw.flush();
        }catch (IOException e){
            System.out.println("Write to the file");
        }

        //read from a file
        try{
            FileReader fr = new FileReader("Exam1.txt");
            while(fr.ready()){
                int letters = fr.read();
                System.out.println((char) letters);
            }
        }catch (IOException e){
            System.out.println("read from a file");
        }

        //read from a file by buffer reader
        try{
            BufferedReader br = new BufferedReader(new FileReader("Exam1.txt"));
            while(br.ready()){
                System.out.println(br.readLine());
            }
        }catch (IOException e){
            System.out.println(e);
        }

        //Buffer writer

        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("Exam1.txt"));
            bw.newLine();
            bw.write("write from buffer writer");
            bw.flush();
        }catch (IOException e){
            System.out.println(e);
        }

        //InputStreamReader
        try{
            InputStreamReader isr = new InputStreamReader(System.in);
            int letters=isr.read();
            while (isr.ready()) {
                System.out.println((char) letters);
                letters=isr.read();
            }
        }catch (Exception e){
            System.out.println(e);
        }

        //outputStreamWriter
        try{
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("Exam1.txt",true));
            osw.write("Gopal");
            char[] arr = "Hello world".toCharArray();
            osw.write(arr);
            osw.flush();
        }catch (IOException e){
            System.out.println(e);
        }

        //delete file
        try{
            File f = new File("Exam1.txt");
            if(f.exists()){
                f.delete();
                System.out.println("success");
            }else{
                System.out.println("not");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
