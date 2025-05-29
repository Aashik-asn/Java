//O(n)
import java.util.Scanner;
public class linear_search {
    public static int search(int[] arr, int target){ //to pass static variable , the func should be static
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr= new int[100];
        for(int i=0;i<arr.length;i++){
            arr[i]=i+1;
        }
        System.out.print("Enter number to search between 1 and 100: ");
        int target = sc.nextInt();
        int index = search(arr,target);
        if(index==-1){
            System.out.println("Element not Found");
        }else{
            System.out.println("Element found at index : "+index);
        }
    }
}
