public class NumberCompliment_476{
     public static int findComplement(int num) {
        int n=num;
        if(n==1){
            return 0;
        }
        int count=0;
        while(n>0){
            n=n>>1;
            count++;
        }
        return ((int)(Math.pow(2,count)-1)-num);
    }
    public static void main(String args[]){
        int num=5;
        System.out.println(findComplement(num));
    }
}