import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr=new int []{3,4,6,7,2,7,2,8,0};
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quicksort(int [] arr, int start, int end){
     if(start<end){
         int low =start;
         int high=end;
         int stardand=arr[low];
         while(low <high){
             while(low<high&&arr[high]>=stardand){//这里必须有等于号
                 high--;
             }
             arr[low]=arr[high];
             while(low<high&&arr[low]<=stardand){
                 low++;
             }
             arr[high]=arr[low];//这里之后不能出现low++因为后面会出现无限循环

         }
         arr[low]=stardand;
         quicksort(arr,start,low);
         quicksort(arr,low+1,end);
     }

    }
}
