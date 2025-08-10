public class insertion_sort{
    public static void main(String[] args) {
        int[] arr = {3,5,2,8,1,9,4};
        sort(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    public static void sort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int temp = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
}