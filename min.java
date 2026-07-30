import java.util.Scanner;

public class Main {

    static void minimum(int a[], int n) {

        int min=a[0];

        for(int i=1;i<n;i++) {
            if(a[i]<min)
                min=a[i];
        }

        System.out.println(min);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int a[]=new int[n];

        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();

        minimum(a,n);
    }
}
