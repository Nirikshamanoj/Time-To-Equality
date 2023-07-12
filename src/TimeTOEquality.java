import java.util.Arrays;
import java.util.Scanner;
public class TimeTOEquality {
    static int minCount(int[] A,int n)
    {
        Arrays.sort(A);
        int count=0;
        int max=A[n-1];
        for(int i=0;i<n;i++)
        {
            if(A[i]==max)
                continue;
            else {
                count+=max-A[i];
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int A[]=new int[n];
        for (int i=0;i<n;i++)
        {
            A[i]=scanner.nextInt();
        }
        int count=minCount(A,n);
        System.out.println(count);
    }
}
