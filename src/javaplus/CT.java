package javaplus;

import java.util.ArrayList;
import java.util.Scanner;

public class CT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        ArrayList<Integer> arrNum = new ArrayList<>();
        while(y > 0)
        { arrNum.add(y %10); y /= 10; }

    }
}
