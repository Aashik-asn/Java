//O(n^2)
public class selection_sort {
    public static void main(String[] args){
        int[] arr = {1,8,5,3,0,9,3};
        sort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
}
