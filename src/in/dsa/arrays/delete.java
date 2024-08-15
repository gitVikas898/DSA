package in.dsa.arrays;

public class delete {
    public static void main(String[] args) {
        int [] arr = {12,13,16,17,19,21};
        int element = 11;
        int newLength = deletes(arr,element);
        System.out.println("Updated Array is : ");
        for(int i = 0 ;i<newLength;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int deletes(int arr[], int element ){
        int i;
        for(i = 0 ; i< arr.length;i++)
        {
            if(arr[i]== element)
                break;
        }
        if(i==arr.length)
            return arr.length;

        for(int j = i ; j< arr.length-1;j++)
        {
            arr[j]=arr[j+1];
        }
        return arr.length-1;
    }

}
