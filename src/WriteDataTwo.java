
import java.io.FileOutputStream;

public class WriteDataTwo {
   public static void main(String[] args) throws Exception {
        //step-1 (open a stream)
        FileOutputStream fos=new FileOutputStream("e:/data/contents.txt");
        //step-2 (write data)
        String s="Something We want To Write To A File";
        byte b[]=s.getBytes();
        //fos.write(b);
        fos.write(b, 3, 10);
        //step-3 (close file)
        fos.close();
        System.out.println("DATA STORED");
    }    
}
