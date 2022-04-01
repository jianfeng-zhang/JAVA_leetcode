package 打卡;

import java.util.HashMap;
import java.util.Map;

public class 从数组一中找数组2 {
    public static void main(String[] args) {
        int []nums1 = {4,1,2};
        int []nums2 = {1,3,4,2};

                int []nums4=nextGreaterElement(nums1,nums2);

    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
int count=0;

        int []nums3=new int [nums1.length];

        for(int i=0;i<nums1.length;i++){

            for(int j=0;j<nums2.length;j++){

                if(nums1[i]==nums2[j]){
                   
                    //i=0 j=2
                    for(int k=j+1;k<nums2.length;k++){
                    //k=3
                        if(nums2[k]>nums2[j]){
                            count++;
                            nums3[i]=nums2[k];
                            break;
                        }
                        nums3[i]=-1;


                    }
                }

            }

        }


        return nums3;
    }
}
