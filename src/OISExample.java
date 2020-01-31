
import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class OISExample {
    public static void main(String[] args) throws Exception {

        FileInputStream fis=new FileInputStream("e:/data/studdata.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Student s=(Student)ois.readObject();
        s.info();
        ois.close();
        fis.close();
        
    }
}
