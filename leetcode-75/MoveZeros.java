import java.util.Arrays;

public class MoveZeros{
    public void moveZeroes(int[] nums){
        int n=nums.length;
        int pos=0;
        // intuition is that we take a position variable and when we find a non-zero element then we store it on pos index and increase the position variable
        for(int i=0;i<n;i++){
            if(nums[i] != 0){
                nums[pos]=nums[i];
                pos++;
            }
        }
        // now all the non-zero are at the front we have to zero all the element that are after position index
        for(int i=pos;i<n;i++){
            nums[i]=0;
        }
    }
    public static void main(String args[]){
        int[] arr={0,1,0,3,12};
        MoveZeros t=new MoveZeros();
        t.moveZeroes(arr);
        System.out.println(Arrays.toString(arr));

    }
}