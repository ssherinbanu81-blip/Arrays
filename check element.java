import java.util.Scanner;

public class Main {

    static void exists(int a[], int n, int key) {

        for(int i=0;i<n;i++) {
            if(a[i]==key) {
                System.out.println("Exists");
                return;
            }
        }

        System.out.println("Not Exists");
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int a[]=new int[n];

        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();

        int key=sc.nextInt();

        exists(a,n,key);
    }
}
