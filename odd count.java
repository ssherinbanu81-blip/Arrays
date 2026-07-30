import java.util.Scanner;

public class Main {

    static void oddCount(int a[], int n) {

        int count=0;

        for(int i=0;i<n;i++) {
            if(a[i]%2!=0)
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

        oddCount(a,n);
    }
}
