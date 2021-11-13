package javaplus;

import java.io.FileInputStream;
import java.io.*;

public class FileEX {
    public static void main(String[] args) throws IOException{
        FileInputStream fis = new FileInputStream("sample.txt"); //존재하는 파일과 연결
        FileOutputStream fos = new FileOutputStream("result.txt"); // 존재하지 않으면 파일 생성, 존재하면 파일 덮어쓰기

        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        int data;
        while((data=fis.read())!=-1){//data에 읽어온 바이트를 저장하는데, data의 값이 -1이 아닐때까지
            //-1 : EOF(End of File)
            bos.write(data);
        }
        bos.close();
        bis.close(); // 스트림을 연결하고 열었으면, 닫아줘야한다
    }
}
