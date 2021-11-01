package javaplus;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerPlus {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("src//javaplus//sample.txt");
            Scanner sc = new Scanner(fis);
            while (sc.hasNext()){
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
