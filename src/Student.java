
import java.io.Serializable;

public class Student implements Serializable {
    private int rno;
    private String name;
    private transient String branch;
    private transient int sem;
    
    public Student(int a, String b, String c, int d){
        rno=a; name=b; branch=c; sem=d;
    }
    public void info(){
        System.out.println(rno+","+name+","+branch+","+sem);
    }
}
