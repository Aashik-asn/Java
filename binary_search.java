//O(logn)
import java.util.Scanner;
public class binary_search{
    private static int search(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>target){
                high=mid-1;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int[] arr=new int[100];
        for(int i=0;i<arr.length;i++){
            arr[i]=i+1;
        }
        System.out.print("Enter target value between 1 and 100: ");
        int target=sc.nextInt();
        int index = search(arr,target);
        if(index==-1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index "+index);
        }
    }
}
