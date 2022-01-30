public class Missing {
    
    public static void main(String[] args) {
        int[] a = {1,3,4,5,6,8,2};
        System.out.println(MissingNum(a));
    }
    public static int MissingNum(int arr[]){

        int leng = arr.length+1;
        int actualSum=0;
        int expectedSum = (leng*(leng+1))/2;
        for(int i=0;i<leng-1;i++){
            actualSum = actualSum+arr[i];
        }
        int num = expectedSum - actualSum;
        return num;
    }
}
