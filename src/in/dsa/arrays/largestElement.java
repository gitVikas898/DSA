package in.dsa.arrays;

public class largestElement {
    public static void main(String[] args) {
        int [] arr = {20,5,10,2};
        System.out.println("Largest element is "+arr[findLargest(arr)]);

    }
    public static int findLargest(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j]>arr[i])
                {
                    flag = false;
                    break;
                }
            }
            if(flag==true)
                return i;
        }

        return -1;
    }
}
