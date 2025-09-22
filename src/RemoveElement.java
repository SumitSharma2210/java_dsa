//java program to remove an element 'val' from an array
public class RemoveElement {
    public static int removeElement(int [] nums, int val){
        int i =0;
        for( int j=0; j<nums.length; j++){
            if(nums[j] != val){
                nums[i]= nums[j];
                i++;
            }
        }
            return i; //i is the number of elements not equal to val

    }
    public static void main (String [] args){
        int [] nums = {3,2,2,3};
        int val =3;
        int k =removeElement(nums,val);
        System.out.println(k);

        System.out.println("The modified array: ");
        for(int index = 0; index<k; index++){
            System.out.println(nums[index]+ " ");
        }
    }
}
