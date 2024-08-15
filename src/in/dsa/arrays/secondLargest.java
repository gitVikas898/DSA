package in.dsa.arrays;

public class secondLargest {
    public static void main(String[] args) {
        int[] arr = {20,12,24,15,16,17,12};
        int indexOfSecondLargest = findSecondLargest(arr);
        System.out.println("The second largest element is indexed at :"+indexOfSecondLargest);
        System.out.println("The second largest element is : "+arr[indexOfSecondLargest]);

    }
    public static int largest(int []arr){
        int largestIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>arr[largestIndex])
            {
                largestIndex=i;
            }
        }
        return largestIndex;
    }

    public static int findSecondLargest(int[]arr){
        int largest = largest(arr);
        int secondLargest = -1; // there may not be a second largest number
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=arr[largest]){
                if(secondLargest==-1)
                {
                    secondLargest =i;
                }
                else if(arr[i]>arr[secondLargest]){
                    secondLargest =i;
                }
            }

        }
        return secondLargest;
    }

}
