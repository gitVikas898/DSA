public class largestElementEfficient {
    public static void main(String[] args) {
        int[] arr ={20,2,8,7,24};
        int largestElementIndex = findLargestIndex(arr);
        System.out.println("Largest element is at index : "+largestElementIndex+" \nAnd the element is : "+arr[largestElementIndex]);
    }
    public static int findLargestIndex(int arr[])
    {
        int res = 0;
        for(int i =1 ; i< arr.length;i++)
        {
            if(arr[i]>arr[res])
            {
                res = i;
            }
        }
        return res;
    }

}
