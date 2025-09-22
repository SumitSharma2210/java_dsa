//java program to reverse an array
public class ArraysCopy {
    public void reverseArray(int [] arr){
        int left = 0;
        int right = arr.length -1;
        int temp;
        while(left<right){
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,6,8,12,15,17};
        ArraysCopy obj = new ArraysCopy();
        obj.reverseArray(arr);

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }


       /* for( int num: arr){
            System.out.println(num + " ");
        }

        */

    }
}
