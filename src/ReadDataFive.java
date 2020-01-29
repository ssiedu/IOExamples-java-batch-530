
import java.io.FileInputStream;

public class ReadDataFive {
public static void main(String[] args){
    //AutoCloable Try / Try With Resource
    try (FileInputStream fis=new FileInputStream("e:/data/info.txt"))
    {
        System.out.println((char)fis.read());//A
        System.out.println((char)fis.read());//B
    }
    catch(Exception e)
    {
        System.out.println("Exception Handled");
    }
    }        
}
