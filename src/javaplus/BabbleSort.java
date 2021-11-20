package javaplus;

public class BabbleSort {
    public static void main(String[] args) {
        int ar[] = {6,4,7,9,1};
        int tmp;
        for(int i = ar.length-1;i>=0;i--){
            for(int k=0;k<i;k++){
                if(ar[k]>ar[k+1]){
                    tmp = ar[k];
                    ar[k]=ar[k+1];
                    ar[k+1]=tmp;
                }
            }
        }
        for (int x : ar){
            System.out.println(x);

        }
    }
}
