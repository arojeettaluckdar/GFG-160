/* 👤 Author: Arojeet Talukdar
 📅 Date: 01-04-2025
 🏷️ Version: 1.0
 📌 Language: Java 
*/
class Solution {
    public int getSecondLargest(int[] arr) {
        int n = arr.length;
        if (n<2){
            return -1;
        }
        
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        
        for (int num:arr){
            if (num>first) {
                second = first;
                first = num;
            } else if (num > second && num != first){
                second = num;
            }
            
        }
        return (second == Integer.MIN_VALUE) ? -1: second;
        
    }
    public static void main (String args[]){
        Solution sol = new Solution();
        int[] arr = {12, 1, 10, 34, 11};
        System.out.println(sol.getSecondLargest(arr));
    }
}