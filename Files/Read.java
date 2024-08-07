package Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Read {
    public static void main(String[] args) {

        // reading content from file character wise
        try (FileReader fr = new FileReader("read1.txt")) {
            int letters = fr.read();
            while (fr.ready()) {
                System.out.print((char) letters);
                letters = fr.read();
                fr.close();
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        /// by BufferedReader read the inputted line
        System.out.println();
        try (BufferedReader br =new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("You type : " + br.readLine());
            br.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // reading line by line from file by BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader("read1.txt"))){
            while(br.ready()){
                System.out.println(br.readLine());
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

