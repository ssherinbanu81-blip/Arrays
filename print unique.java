import java.util.Scanner;

public class Main {

    static void unique(int a[], int n) {

        for(int i=0;i<n;i++) {

            int count=0;

            for(int j=0;j<n;j++) {
                if(a[i]==a[j])
                    count++;
            }

            if(count==1)
                System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int a[]=new int[n];

        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();

        unique(a,n);
    }
}
