import java.util.Scanner;
public class prefix {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n;
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++)
        {
            x[i]=x[i-1]+x[i];
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(x[i]+" ");
        }
        sc.close();
    }
    
}
