
import java.io.File;

public class FileInfoTwo {
public static void main(String[] args) {
        File f=new File("e:/data/");
        
        
        if(f.isDirectory()){
                String ar[]=f.list();
                for(String tmp:ar){
                    System.out.println(tmp);
                }
        }else{
            System.out.println("Not Found Or Not A Folder");
        }
        
    }    
}
