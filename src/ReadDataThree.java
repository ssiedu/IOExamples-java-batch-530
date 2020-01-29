
import java.io.FileInputStream;


public class ReadDataThree {

    public static void main(String[] args) throws Exception {
        FileInputStream fis=new FileInputStream("e:/data/info.txt");
        System.out.println((char)fis.read());//A
        System.out.println((char)fis.read());//B
        System.out.println((char)fis.read());//C
        System.out.println((char)fis.read());//D->E
        fis.skip(4);//E,F,G,H->I
        System.out.println((char)fis.read());//I
        System.out.println((char)fis.read());//J
        System.out.println((char)fis.read());//K->L
        fis.skip(3);//L,M,N->O
        System.out.println((char)fis.read());//O
        System.out.println((char)fis.read());//P
        fis.close();
    }
}
