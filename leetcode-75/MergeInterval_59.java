import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeInterval_59 {
     public int[][] merge(int[][] intervals){

        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0], b[0]));
        int n=intervals.length;
        int start1=intervals[0][0];
        int end1=intervals[0][1];

        List<List<Integer>> list=new ArrayList<>();

        for(int i=1;i<n;i++){
            int start2=intervals[i][0];
            int end2=intervals[i][1];

            if(end1 >= start2){
                // start1=start1;
                end1=Math.min(end1,end2);
            }else{
                list.add(Arrays.asList(start1,end1));
                start1=start2;
                end1=end2;
            }
        }
         list.add(Arrays.asList(start1,end1));

         int[][] res=new int[list.size()][2];
         for(int i=0;i<list.size();i++){
            res[i][0]=list.get(i).get(0);
            res[i][1]=list.get(i).get(1)
         }
         return res;
     }
}
