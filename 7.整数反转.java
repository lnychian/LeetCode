/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        int temp = x > 0 ? x : (-x);
        int result = 0;
        int result2 = 0;
        while(temp>0){
            result = result * 10 + temp % 10;
            if(result/10 != result2){
                return 0;
            }
            result2 = result;
            temp /= 10;
        }
        return x > 0 ? result : (-result);
    }
}
// @lc code=end

