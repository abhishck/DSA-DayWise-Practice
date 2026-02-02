import java.util.*;

public class Kid_With_The_Greatest_Candies{
     public  List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;
        int max=Integer.MIN_VALUE;
        List<Boolean> list=new ArrayList<>();
        // intuition is that if the element + extraCandies is less than the max element from the array then it always false because question is saying that greatest among all the element of the array
        for(int el : candies){   
            max=Math.max(el,max);
        }
        for(int i=0;i<n;i++){
            int value=extraCandies+candies[i];
            if(value>=max){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int [] arr={2,3,5,1,3};
        int extraCandies = 3;
        Kid_With_The_Greatest_Candies t1=new Kid_With_The_Greatest_Candies();
        System.out.println(t1.kidsWithCandies(arr,extraCandies));
    }
}