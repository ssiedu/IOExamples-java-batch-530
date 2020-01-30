
import java.io.FileWriter;


public class WriterDemo {

    public static void main(String[] args) throws Exception {

        FileWriter writer=new FileWriter("e:/sample.txt");
        writer.write("some data stored using writer\n");
        writer.write("more and more data to be stored\n");
        writer.write("javaexample",1,5);
        writer.close();
        System.out.println("Data Stored");
    }
}
/*
    Writer

    write(String)
    write(String,int,int)
    write(char[])
    write(char[],int,int)





*/