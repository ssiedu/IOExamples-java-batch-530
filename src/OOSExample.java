
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class OOSExample {
    public static void main(String[] args) throws Exception {
        Student s=new Student(111,"Abcd","CS",4);
        s.info();
        System.out.println("Now We Are Preserving State of Obj");
        FileOutputStream fos=new FileOutputStream("e:/data/studdata.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(s);
        oos.close();
        fos.close();
        System.out.println("Object Stored ...");
    }
}
