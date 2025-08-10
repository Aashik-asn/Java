import java.util.Scanner;
import java.util.Arrays;
public class missing_attendance{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
        }
        boolean flag=true;
        arr[n-1]=n;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(i+1!=arr[i]){
                flag=false;
                System.out.println(i+1);
            }
        }
        if(flag){
            System.out.println(n);
        }
    }
}