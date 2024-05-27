package DynamicPrograming.MatrixChainMult.PalindromePartition;

import java.util.Arrays;

class GFG {
    static int dp[][][];
    public static int countWays(int N, String S)
    {
        dp = new int[N + 1][N + 1][2];

        for (int row[][] : dp)
            for (int col[] : row)
                Arrays.fill(col, -1);
        return parenthesis_count(S, 0, N - 1, 1);
    }

    public static int parenthesis_count(String str, int i,
                                        int j, int bool)
                                        
    {
        if(i>j)return 0;
        if(i==j){
            if(bool==1){
                return (str.charAt(i)=='T')?1:0 ;
            }
            else{
                return (str.charAt(i)=='F')?1:0;
            }
        }
        int temp_ans = 0;

//        int leftTrue, rightTrue, leftFalse, rightFalse;

        for (int k = i + 1; k <= j - 1; k = k + 2) 
        {
//                leftTrue = parenthesis_count(str, i, k - 1,
//                                             1);
//                leftFalse = parenthesis_count(str, i, k - 1,
//                                              0);
//                rightTrue = parenthesis_count(str, k + 1, j,
//                                              1);
//                rightFalse = parenthesis_count(str, k + 1,
//                                               j, 0);
            int leftTrue=parenthesis_count(str,i,k-1,1);
            int leftFalse=parenthesis_count(str,i,k-1,0);
            int rightTrue=parenthesis_count(str,k+1,j,1);
            int rightFalse=parenthesis_count(str,k+1,j,0);
            if (str.charAt(k) == '&')
            {
                if (bool == 1) 
                {
                    temp_ans
                        = temp_ans + leftTrue * rightTrue;
                }
                else
                {
                    temp_ans = temp_ans
                               + leftTrue * rightFalse
                               + leftFalse * rightTrue
                               + leftFalse * rightFalse;
                }
            }
            // Evaluate OR operation
            else if (str.charAt(k) == '|')
            {
                if (bool == 1)
                {
                    temp_ans = temp_ans
                               + leftTrue * rightTrue
                               + leftTrue * rightFalse
                               + leftFalse * rightTrue;
                }
                else
                {
                    temp_ans
                        = temp_ans + leftFalse * rightFalse;
                }
            }
          
            // Evaluate XOR operation
            else if (str.charAt(k) == '^') 
            {
                if (bool == 1)
                {
                    temp_ans = temp_ans
                               + leftTrue * rightFalse
                               + leftFalse * rightTrue;
                }
                else 
                {
                    temp_ans = temp_ans
                               + leftTrue * rightTrue
                               + leftFalse * rightFalse;
                }
            }
            dp[i][j][bool] = temp_ans;
        }
        return temp_ans;
    }
  
  // Driver code
    public static void main(String[] args)
    {
        String S = "T|T&F^T";
        int N = S.length();
        System.out.println(countWays(N, S));
    }
}

