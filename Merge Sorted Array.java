//hidden code 
import java.util.*;
public class SkillRack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc .nextInt();    // input for m 
        int n = sc .nextInt();    // input for n
        int[] nums1 = new int[m+n];  //Array nums1 Created
        int i;
        for(i=0;i<m;i++){
            nums1[i] = sc.nextInt();
        }
        int[] nums2 = new int[n];  // Array nums2 Created
        for(i=0;i<n;i++){
            nums2[i] = sc.nextInt();
        }merge(nums1,m,nums2,n);    //merge has been called
        System.out.println(Arrays.toString(nums1));
    }//Hidden Code
// leetcode Entry code
  
  public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int j=0,i=m;j<n;j++){    //looping to traverse the remaining space so that array nums2 can be added to  nums1
            nums1[i]=nums2[j];      // nums2 has been added to the end of the Array nums1
            i++;                    //Incrementing i Value
        }
        Arrays.sort(nums1);    //To sort Array nums1 So that it prints in sorted Order 
    }    // leetcode Entry code
}
