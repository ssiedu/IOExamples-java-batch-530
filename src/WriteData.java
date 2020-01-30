
import java.io.FileOutputStream;


public class WriteData {
    public static void main(String[] args) throws Exception {
        //to write something to a file 
        //step-1 (open the stream)
        FileOutputStream fos=new FileOutputStream("e:/data/contents.txt");
        //FileOutputStream fos=new FileOutputStream("e:/data/contents.txt", true);
        //step-2 (write the data on stream)
        fos.write(65);
        fos.write(66);
        fos.write(67);
        fos.write(68);
        fos.write(69);
        //step-3 (close the file)
        fos.close();
        System.out.println("DATA STORED");
    }
}
/*
    OutputStream
    ---------------
    void write(int)
    void write(byte[])
    void write(byte[],int,int)
    void close()
*/
