import java.util.Scanner;
class Solution {
    public boolean canJump(int[] nums) {
        int reachable = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > reachable) return false; // You can't reach this index
            reachable = Math.max(reachable, i + nums[i]); // Update reachable range
        }
        return true;
    }
}

//Main class
public class JumpGame {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String[] Tokens = sc.nextLine().trim().split("\\s+");
        int[] Jump = new int[Tokens.length];
        for(int i = 0; i < Tokens.length; i++){
            Jump[i] = Integer.parseInt(Tokens[i]);
        }Solution sol = new Solution();
        Boolean out = sol.canJump(Jump);
        System.out.println(out);
    }
}
