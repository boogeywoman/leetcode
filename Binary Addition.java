//https://leetcode.com/problems/add-binary/submissions/1204113387/
class Solution {
    public String addBinary(String a, String b) {
     StringBuilder result = new StringBuilder();
     int carry = 0, sum;
       int j = b.length() - 1;
     for (int i = a.length() - 1; i>=0 || j>=0 || carry !=0; i-- , j-- )
     {
          sum=carry;
         if(i >= 0) sum += a.charAt(i) - '0';
         if(j >= 0) sum += b.charAt(j) - '0';

          result.insert(0, (sum % 2 == 0)?'0':'1');
          carry = sum / 2 ;
     }
      return result.toString();  
    }
    public static void main(String args[]){
        Solution solution = new Solution();
        String result = solution.addBinary("101011", "10010");
        System.out.println("The result of binary addition: " + result);
    } 


}