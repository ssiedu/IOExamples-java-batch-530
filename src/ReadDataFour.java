
import java.io.FileInputStream;

public class ReadDataFour {
public static void main(String[] args){
    FileInputStream fis=null;
    try{
        fis=new FileInputStream("e:/data/info.txt");
        System.out.println((char)fis.read());//A
        System.out.println((char)fis.read());//B
    }catch(Exception e){
        System.out.println("Exception Handled");
    }finally{
        try{
        fis.close();
        }catch(Exception e){}
    }
    }    
}
