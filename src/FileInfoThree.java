
import java.io.File;


public class FileInfoThree {

    public static void main(String[] args) {
        //File f=new File("e:/data/info.txt");
        File f=new File("e:/java5/AccountManager.java");
        boolean b1=f.isHidden();
        boolean b2=f.canWrite();
        //no of milliseconds which has passed from
        //epoch (00:00:00 GMT, January 1, 1970)
        //to till the last modification
        long val=f.lastModified();
        java.util.Date dt=new java.util.Date(val);
        
        System.out.println("Hidden : "+b1);
        System.out.println("Write  : "+b2);
        System.out.println("Mdfd : "+val);
        System.out.println("Mdfd : "+dt);
    }
}
