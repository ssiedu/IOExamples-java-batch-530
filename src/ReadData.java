import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadData {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //we want to read contents of info.txt
        
        //step-1 (open the stream)
        //FileInputStream fis=new FileInputStream("e:/java5/AccountManager.java");
        FileInputStream fis=new FileInputStream("e:/data/trial.txt");
        //step-2 (read the data from stream)
        boolean b=fis.markSupported();
        System.out.println(b);
        while(true){
            int n=fis.read();
            if(n==-1)break;
            System.out.print((char)n);
        }
        
        //step-3 (close the stream)
        fis.close();
        
        
        
        
    }
}
/*
    InputStream
        int read()
        int read(byte[])
        int available()
        skip
        close
        mark
        reset
        markSupported

*/