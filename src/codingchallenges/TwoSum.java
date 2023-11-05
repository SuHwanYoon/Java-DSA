package codingchallenges;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] numbers = {2,3,7,4,8};
        int target = 7;
        int[] result = getTwoSumIndex(numbers,target);
        System.out.println(result[0]+" "+result[1]);

    }

    public static int[] getTwoSumIndex(int[] numbers, int target){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i=0; i< numbers.length; i++){
            int complement = target - numbers[i];
            if (hashMap.containsKey(complement)){
                return new int[] {hashMap.get(complement), i};
            }
            hashMap.put(numbers[i],i);
        }
        return new int[] {-1,-1};
    }
}
