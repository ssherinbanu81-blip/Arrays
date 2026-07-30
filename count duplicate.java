import java.util.Scanner;

public class Main {

    static void countDuplicate(int a[], int n) {

        int count=0;

        for(int i=0;i<n;i++) {

            boolean visited=false;

            for(int k=0;k<i;k++) {
                if(a[i]==a[k]) {
                    visited=true;
                    break;
                }
            }

            if(visited)
                continue;

            for(int j=i+1;j<n;j++) {
                if(a[i]==a[j]) {
                    count++;
                    break;
                }
            }
        }

        System.out.println(count);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int a[]=new int[n];

        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();

        countDuplicate(a,n);
    }
}
