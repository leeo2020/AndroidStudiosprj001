import java.io.*;
public class HelloWOrld {
String ss="You Never understand me!";
byte buff[]=ss.getBytes();
OutputStream f1=new FileOutputStream("file1.txt");
    public HelloWOrld() throws IOException {
    for(int i=0;i<buff.length;i++){
        try {
            f1.write(buff[i]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        try {
            f1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


