class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int m = num1.length(), n = num2.length();
        int[] res = new int[m + n];

        // Process digits from right to left
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = mul + res[i + j + 1];

                res[i + j + 1] = sum % 10;      // Ones place
                res[i + j] += sum / 10;          // Carry to previous position
            }
        }

        // Convert array to string, skipping leading zeros
        StringBuilder sb = new StringBuilder();
        for (int val : res) {
            if (!(sb.length() == 0 && val == 0)) {
                sb.append(val);
            }
        }

        return sb.toString();
    }
}