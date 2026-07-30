import java.util.Scanner;

public class Main {

    static void duplicate(int a[], int n) {

        for(int i=0;i<n;i++) {

            boolean printed=false;

            for(int k=0;k<i;k++) {
                if(a[i]==a[k]) {
                    printed=true;
                    break;
                }
            }

            if(printed)
                continue;

            for(int j=i+1;j<n;j++) {
                if(a[i]==a[j]) {
                    System.out.print(a[i]+" ");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int a[]=new int[n];

        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();

        duplicate(a,n);
    }
}
