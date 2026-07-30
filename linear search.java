import java.util.Scanner;

public class Main {

    static void search(int a[], int n, int key) {
        for(int i=0;i<n;i++) {
            if(a[i]==key) {
                System.out.println("Found at position " + (i+1));
                return;
            }
        }
        System.out.println("Not Found");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int a[]=new int[n];

        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();

        int key=sc.nextInt();

        search(a,n,key);
    }
}
