class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            // If the digit is less than 9, just increment and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If it is 9, it becomes 0, and the loop continues to handle the carry
            digits[i] = 0;
        }

        // If the execution reaches here, it means all digits were 9 (e.g., [9, 9, 9])
        int[] result = new int[digits.length + 1];
        result[0] = 1; // The new array automatically initializes other elements to 0
        return result;
    }
}