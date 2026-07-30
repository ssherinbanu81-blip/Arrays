import java.util.Scanner;

public class Main {
    static void firstOccurrence(int a[], int n, int key) {

        for(int i=0;i<n;i++) {
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

        firstOccurrence(a,n,key);
    }
}
