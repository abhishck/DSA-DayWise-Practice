import java.util.HashSet;

public class IntersectionOfTwoArrays_349{
    public int[] intersection(int[] nums1, int[] nums2){
        int n=nums1.length;
        int m=nums2.length;

        HashSet<Integer> set=new HashSet<>();
        int[] freq=new int[1001];
        for(int i=0;i<n;i++){
            freq[nums1[i]]++;
        }
        for(int i=0;i<m;i++){
            if(freq[nums2[i]]>0){
                set.add(freq[nums2[i]]);
            }
        }
        int j=0;
        int[] res=new int[set.size()];
        for(int elem:set){
            res[j++]=elem;
        }
        return res;
    }
}