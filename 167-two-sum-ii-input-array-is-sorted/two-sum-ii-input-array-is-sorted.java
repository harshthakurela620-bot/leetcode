class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int Left = 0;
        int Right = numbers.length - 1;
        boolean found = false;
        while (Left<Right){
            int sum = numbers[Left] + numbers[Right];
            if(sum == target){
                System.out.println("Elemnt found at index "+ Left +" And "+ Right);
                found = true;
                break;
            }
            else if(sum > target){
                Right--;
            }
            else {
                Left++;
            }
        }
        if (found == false){
            System.out.println("Element not found");
        }
        return new int[]{Left+1 , Right+1};
    }
}