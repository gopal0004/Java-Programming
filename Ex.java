import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex {
    public static void main(String[] args) throws Exception{

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            // copying bytes
            in = new FileInputStream("new_one.txt");
            out = new FileOutputStream("copy.txt");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }

        //copying characters
        FileReader fr = new FileReader("copy.txt");
        FileWriter fw=new FileWriter("copy1.txt",true);

        try {
            int c;
            while ((c=fr.read()) != -1) {
                fw.write(c);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        fr.close();
        fw.close();
    }
}