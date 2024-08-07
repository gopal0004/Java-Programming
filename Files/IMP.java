package Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
public class IMP {
    public static void main(String[] args) {
        
        // Creating a file 
        try{
            File fo=new File("new_one.txt");
            fo.createNewFile();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        // Writing to a file
        try{
            FileWriter fw = new FileWriter("new_one.txt",true);
            fw.append("\nJay Dwarkadhis");
            fw.flush();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        //writing to a file by BufferedWriter
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("new_one.txt",true));
            bw.newLine();
            bw.write("Written from BufferedWriter");
            bw.flush();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        // reading from a file
        try{
            FileReader fr = new FileReader("new_one.txt");
            while (fr.ready()) {
                int letters=fr.read();
                System.out.println((char) letters);
            }
            fr.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        //Reading from a file by BufferedReader
        try {
            BufferedReader br=new BufferedReader(new FileReader("new_one.txt"));
            while (br.ready()) {
                // int letters=br.readLine();
                System.out.println(br.readLine());
            }
            br.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // taking input by InputStreamReader
        try{
            InputStreamReader isr=new InputStreamReader(System.in);
            System.out.println("Enter letters");
            int letters=isr.read();
            while(isr.ready()){
                System.out.println((char) letters);
                letters=isr.read();
            }
            isr.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        //using BufferReader reading the inputted line
        try {
            System.out.println("enter sentence");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("you typed : " + br.readLine());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //deleting a file
        try{
            File f1 = new File("random.txt");
            f1.createNewFile();
            if(f1.delete()){
                System.out.println("File deleted successfully");
                System.out.println("Deleted file is : " + f1.getName());
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        //deleting a existing file
        try{
            // File f2 = new File("new_one.txt");
            if(new File("new_one.txt").exists()){
                new File("new_one.txt").delete();
                System.out.println("file deleted successfully");
                System.out.println(new File("new_one.txt").getName());
            }else{
                System.out.println("file not exist");
            }
        }catch (SecurityException e){
            System.out.println(e.getMessage());
        }
    }
}
