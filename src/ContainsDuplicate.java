import java.util.HashSet;


public class ContainsDuplicate {
    public static boolean containsDuplicate(int [] nums){
        HashSet<Integer> seen = new HashSet<>();
        for ( int num: nums){
            if(seen.contains(num)){
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int [] nums1 = {1,3,5,7,8,2,1};
        System.out.println(containsDuplicate(nums1));

        int [] nums2= {1,34,57,8,3};
        System.out.println(containsDuplicate(nums2));
    }
}
