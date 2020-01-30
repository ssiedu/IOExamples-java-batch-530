
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class ReadWriteData {
    public static void main(String[] args) throws Exception {

        String source="d:\\images\\Tulips.jpg";
        String dest1="e:\\data\\flowers.jpg";
        String dest2="e:\\data\\flowerscopy.jpg";
        FileInputStream fis=new FileInputStream(source);
        FileOutputStream fos1=new FileOutputStream(dest1);
        FileOutputStream fos2=new FileOutputStream(dest2);
        
        int size=fis.available();
        byte b[]=new byte[size];
        fis.read(b);
        fos1.write(b);
        fos2.write(b);
        
        /*
        while(true){
            //reading a byte from source
            int data=fis.read();
            
            if(data==-1){
                break;
            }
            //writing that byte to dest
            fos.write(data);
        }
        */
        fis.close();
        fos1.close();
        fos2.close();
        System.out.println("Data Transferred");
    }
}
