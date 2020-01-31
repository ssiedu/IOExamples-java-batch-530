
import java.io.DataInputStream;
import java.io.FileInputStream;


public class DISExample {
    public static void main(String[] args) throws Exception {

            FileInputStream fis=new FileInputStream("e:/data/empdata.txt");
            DataInputStream dis=new DataInputStream(fis);
            int v1=dis.readInt();
            double v2=dis.readDouble();
            boolean v3=dis.readBoolean();
            dis.close();
            fis.close();
            System.out.println("Emp No. : "+v1);
            System.out.println("Salary  : "+v2);
            System.out.println("Married : "+v3);
    }
}
