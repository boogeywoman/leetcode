https://leetcode.com/problems/plus-one/
class PlusOne {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        int carry = 0;

        if (digits[i] < 9) {
            digits[i] = digits[i] + 1;
            return digits;
        } else {
            while (digits[i] == 9 && i > 0) {
                digits[i] = 0;
                carry = 1;
                i--;
            }

            if (i == 0 && digits[i] == 9) {
                digits[i] = 0;
                carry = 1;

                int[] digits2 = new int[digits.length + 1];
                digits2[i] = 1;

                for (int j = 1; j < digits2.length; j++) {
                    digits2[j] = digits[j - 1];
                }
                return digits2;

            } else {
                digits[i] = digits[i] + carry;
                return digits;
            }
        }
    }
}
