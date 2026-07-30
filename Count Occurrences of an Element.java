import java.util.Scanner;

public class Main {

    static void countOccurrence(int a[], int n, int key) {
        int count=0;

        for(int i=0;i<n;i++) {
            if(a[i]==key)
                count++;
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int a[]=new int[n];

        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();

        int key=sc.nextInt();

        countOccurrence(a,n,key);
    }
}
