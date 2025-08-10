//O(n^2)
public class bubble_sort {
    public static void main(String[] args) {
        int[] arr = {3,4,5,7,2,3,1,49,6,0,9};
        sort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
