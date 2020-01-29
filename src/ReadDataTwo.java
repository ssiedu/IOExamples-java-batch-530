import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDataTwo {
    public static void main(String[] args) throws FileNotFoundException, IOException {
//        FileInputStream fis=new FileInputStream("e:/data/trial.txt");
        FileInputStream fis=new FileInputStream("e:/java5/AccountManager.java");
        int total=fis.available();
        
        byte b[]=new byte[total];
        int n=fis.read(b);
        System.out.println(n);
        String str=new String(b);
        System.out.println(str);
        fis.close();
    }
}
