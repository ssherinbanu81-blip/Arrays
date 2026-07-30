import java.util.Scanner;

public class Main {

    static void lastOccurrence(int a[], int n, int key) {

        for(int i=n-1;i>=0;i--) {
            if(a[i]==key) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int a[]=new int[n];

        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();

        int key=sc.nextInt();

        lastOccurrence(a,n,key);
    }
}
