
import java.io.File;
import java.io.IOException;


public class FileInfoFour {

    public static void main(String[] args) throws IOException {
        File f=new File("e:/data/myfile.txt");
        boolean b=f.createNewFile();
        //File f=new File("e:/data/trial.docx");
        //boolean b=f.mkdir();
        //boolean b=f.delete();
        /*
        File f1=new File("e:/data/demo.bmp");
        File f2=new File("e:/java5/demo.bmp");
        boolean b=f1.renameTo(f2);
        */
        if(b){
            System.out.println("Operation Succcess");
        }else{
            System.out.println("Operation Failed");
        }
    }
}
