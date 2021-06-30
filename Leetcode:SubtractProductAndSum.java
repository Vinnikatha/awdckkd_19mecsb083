/*Leetcode program: Subtract the product and sum of digits of an integer */
class Solution {
public:
    int subtractProductAndSum(int n) {
        ///first keep track of a sum
        int sum = 0;
        int copy = n;
        while (copy > 0) {
            sum += copy % 10;
            copy /= 10;
        }
        int prod = 1;
        copy = n;
        while(copy > 0) {
            prod *= copy %10;
            copy /= 10;
        }
        return prod - sum;
    }
};


Output:
Your input
234
Output
15
Expected
15
