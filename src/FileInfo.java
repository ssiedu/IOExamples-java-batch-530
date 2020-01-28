import java.io.File;

//this code is for demonstrating file class methods

public class FileInfo {
    public static void main(String[] args) {
        //File f=new File("e:/data/info.txt");
        File f=new File("e:/data/info.txt");
        boolean b1=f.exists();
        if(b1==true){
            boolean b2=f.isFile();
            if(b2==true){
                long val=f.length();
                System.out.println(val);
            }else{
                System.out.println("Its a Folder");
            }
        }else{
            System.out.println("Not Available ");
        }
    }
}
/*
    java.io.File    (non-static)
    File(String)

    long length()
    boolean exists()
    boolean isFile()
    boolean isDirectory()
    String[] list()
    boolean isHidden()
    boolean canWrite()
    long lastModified()

    boolean mkdir()
    boolean delete()
    boolean renameTo(File)
    boolean createNewFile()

*/
